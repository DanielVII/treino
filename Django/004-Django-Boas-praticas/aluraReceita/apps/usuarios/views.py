from genericpath import exists
from django.shortcuts import redirect, render, get_object_or_404
from django.contrib.auth.models import User
from django.contrib import auth, messages
from receitas.models import Receita

def cadastro (request):
    """ Cadastra usuario no site """
    if request.method == 'POST':
        nome = request.POST['nome']
        email = request.POST['email']
        senha = request.POST['password']
        senha2 = request.POST['password2']

        if campo_vazio(nome):
            messages.error(request, 'Campo nome não pode está vazio')
            return redirect('cadastro')

        if campo_vazio(email):
            messages.error(request, 'Campo email não pode está vazio')
            return redirect('cadastro')

        if senha != senha2:
            messages.error(request, 'As senhas não são iguais.')
            return redirect('cadastro')

        if User.objects.filter(email=email).exists():
            messages.error(request, 'Usuario já existe')
            return redirect('cadastro')

        if User.objects.filter(username=nome).exists():
            messages.error(request, 'Usuario já existe')
            return redirect('cadastro')

        user = User.objects.create_user(username=nome, email=email, password=senha)
        user.save()
        messages.success(request,'Deu bom')
        return redirect('login')
    else:
        return render(request, 'usuarios/cadastro.html')

def login(request):
    """ Autentica usuario no site """
    if request.method == 'POST':
        email = request.POST['email']
        senha =request.POST['senha']

        if email == "" or senha == "":
            return redirect('login')

        if User.objects.filter(email=email).exists():
            nome = User.objects.filter(email=email).values_list('username', flat=True).get()
            user = auth.authenticate(request, username=nome, password=senha)
            if user is not None:
                auth.login(request, user)
                return redirect('dashboard')
    return render(request, 'usuarios/login.html')

def logout(request):
    """ Desliga usuario do site """
    auth.logout(request)
    return redirect('index')

def dashboard(request):
    """ Tela inicial tanto para quem está logado, para quem não"""
    if request.user.is_authenticated:
        id = request.user.id
        receitas = Receita.objects.order_by('-data_receita').filter(pessoa=id)
        
        dados = {
            'receitas': receitas
        }
        
        return render(request, 'usuarios/dashboard.html', dados)
    else:
        return redirect('index')

def campo_vazio(campo):
    return not campo.strip()
