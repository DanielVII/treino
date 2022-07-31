<h1 align="center">API com Django 3: Django Rest Framework</h1>
<p align="center">
Meu primeiro contato com API's. O curso pegou a base de uma escola pra montar o projeto, criando URL's com CRUD completo de alunos, cursos e matrículas. Além de ter URL's somente para vizualização de informação. Também foi implementado uma autenticação básico, para não deixar qualquer um acessar os dados. Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
    <a href="https://www.linkedin.com/in/guilherme-lima-458925178/">Guilherme Lima</a>.
</p>

[![forthebadge made-with-python](http://ForTheBadge.com/images/badges/made-with-python.svg)](https://www.python.org/)

### Para rodar essa aplicação é necessario as seguintes ferramentas :bookmark_tabs:

<ul>
    <li><a href="https://git-scm.com">Git</a></li>
    <li><a href="https://www.python.org/">Python</a></li>
    <li><a href="https://www.djangoproject.com/">Django</a></li>
    <li><a href="https://www.postgresql.org/">Postgresql</a></li>
</ul>

### Projeto rodando ⚙️

<div align="center">
    <h4 align="center">CRUD via API de um dos alunos</h4>
    <img src="https://user-images.githubusercontent.com/62727519/182042184-37654ba7-dba7-4d4d-84c7-9fc0607c32c8.png"/>
    <h4 align="center">CRUD do curso</h4>
    <img src="https://user-images.githubusercontent.com/62727519/182042480-f2624a07-29fc-41b4-89b4-5762ff958c52.png"/>
    <h4 align="center">CRUD da matricula</h4>
    <img src="https://user-images.githubusercontent.com/62727519/182042516-6c0f0921-a5f3-463f-b3f9-724910666aea.png"/>
    <h4 align="center">Visualização dos alunos matriculados no curso</h4>
    <img src="https://user-images.githubusercontent.com/62727519/182042681-941ff2a5-2a79-4295-8f2a-10f26432ab90.png"/>
    <h4 align="center">Visualização dos cursos que o aluno está matriculado</h4>
    <img src="https://user-images.githubusercontent.com/62727519/182042702-638845c4-3781-4d4d-955b-f627ce2dc977.png"/>
    <h4 align="center">Acesso à API negado pela falta de credenciais</h4>
    <img src="https://user-images.githubusercontent.com/62727519/182042715-9c8b718f-7db0-4551-90fc-436b2ce868da.png"/>
</div>

### Colocando para funcionar (Ubuntu)

<P>Clone o repositorio</p>

```bash
$ git clone https://github.com/DanielVII/treino.git
```

<p>É possivel que o Psycopg2 der erro na hora de instalar, para resolver isso é só baixar a lib:</p>

```bash
$ sudo apt install libpq-dev python3-dev

```

```bash
sudo apt install build-essential
```

<p>Crie o ambiente virtual "venv"</p>

```bash
$ python3 -m venv ./venv
```

<p>Entre na máquina virtual</p>

```bash
$ source .../path/to/venv/bin/activate
```

<p>Instale o Django</p>

```bash
#Dentro da máquina virtual
$ pip install django
```

<p>Instale o Psycopg(Para a conexão com o postgres)</p>

```bash
#Dentro da máquina virtual
$ pip install psycopg2
```

<p>Seu binario</p>

```bash
#Dentro da máquina virtual
$ pip install psycopg2-binary
```

<p>Instale o REST framework</p>

```bash
#Dentro da máquina virtual
$ pip install djangorestframework
```

```bash
#Dentro da máquina virtual
$ pip install markdown
```

#### Parte do Back

<p>Infos do Server e DB:</p>
<ol>
    <li>User: postgres</li>
    <li> Senha: Elefanterosa</li>
    <li>Host: localhost</li>
    <li>Name DataBase: alura_escola</li>
</ol>

<p>Caso alguma info seja diferente das de cima será necessario mudar em "../settings.py" os dados do DataBase.</p>

<p>Após essas configurações é necessario fazer as migrações das tabelas:</p>

```bash
#Dentro da máquina virtual
$ python manage.py migrate
```


### Certificado

<img src="https://user-images.githubusercontent.com/62727519/182042964-47329482-71bc-4d2a-a7c5-bc39ec1a5fa7.png"/>
<img src="https://user-images.githubusercontent.com/62727519/182042993-53be6394-1aa3-488d-8ca9-634d80dfc354.png"/>