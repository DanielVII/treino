<h1 align="center">Integração de modelos no Django: Filtros, buscas e admin</h1>
<p align="center">
    Esse projeto é uma extensão do 001. Nele foi melhorado bastante a visualização do admin, além de ter colocado um search nas "tabelas" do admin, tal serach foi implementado no site principal também, assim facilitando achar as receitas. Ademais, foi adicionado usuários com poderes limitados pelo adm. Por fim foi colocado fotos pra deixar as receitas mais únicas(apesar de eu não ter escolhido as melhores imagens/nomes). Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
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
    <h4 align="center">Admin melhorado</h4>
    <img src="https://user-images.githubusercontent.com/62727519/164734280-ae5745c2-0f74-4a19-94a7-43fda963cf7b.png"/>
    <h4 align="center">Receitas com fotos</h4>
    <img src="https://user-images.githubusercontent.com/62727519/164734604-221ee996-f480-49bf-b473-b9cab9ce9086.png"/>
    <h4 align="center">Search funcionando</h4>
    <img src="https://user-images.githubusercontent.com/62727519/164734787-44c67921-90f7-481c-acd5-1853b19235a6.png"/>
</div>

### Colocando para funcionar (Ubuntu)

<P>Clone o repositorio</p>

```bash
$ git clone https://github.com/DanielVII/treino.git
```

<p>É possivel que o Psycopg2 der erro na hora de instalar, para resolver isso é só baixar a lib:</p>

```bash
$ sudo apt install libpq-dev
```

<p>Crie o ambiente virtual "venv"</p>

```bash
$ python3 -m venv ./venv
```

<p>Entre na máquina virtual</p>

```bash
$ source .../path/to/002-Django-filtros-search/venv/bin/activate
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

<p>Instale o pillow(para lidar com as fotos do site)</p>

```bash
#Dentro da máquina virtual
$ pip install pillow
```

#### Parte do Back

<p>Infos do Server e DB:</p>
<ol>
    <li>User: postgres</li>
    <li> Senha: Elefanterosa</li>
    <li>Host: localhost</li>
    <li>Name DataBase: alura_receita</li>
</ol>

<p>Caso alguma info seja diferente das de cima será necessario mudar em "../aluraReceita/aluraReceita/settings.py" os dados do DataBase.</p>

<p>Após essas configurações é necessario fazer as migrações das tabelas:</p>

```bash
#Dentro da máquina virtual
$ python manage.py migrate
```


### Certificado

<img src="https://user-images.githubusercontent.com/62727519/164735040-d7b16e09-ff77-4b7d-9460-a77ee0fc925d.png"/>
<img src="https://user-images.githubusercontent.com/62727519/164735197-78e7897b-6507-48c3-a9f8-c7ea8d477d7b.png"/>
