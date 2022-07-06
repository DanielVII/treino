<h1 align="center">Autenticação no Django: formulários, requisições e mensagens</h1>
<p align="center">
Esse projeto é uma extensão do 002. Nele foi criado o sistema de usuário. O user padrão pode criar e ver receitas no seu dashboard. Claro que com esse novo sistema foi implementado o registro de usuários e autenticação do mesmo. Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
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

### Projeto rodando ⚙️

<div align="center">
    <h4 align="center">Registro de usuário</h4>
    <img src="https://user-images.githubusercontent.com/62727519/177558666-5ba557a9-d247-4e5e-8946-c0a09c229ad5.png"/>
    <h4 align="center">Login após registro bem sucedido</h4>
    <img src="https://user-images.githubusercontent.com/62727519/177559896-b40ad2ae-fe66-4a50-981b-e1b39f923ebe.png"/>
    <h4 align="center">Usuário criando nova receita</h4>
    <img src="https://user-images.githubusercontent.com/62727519/177562680-b8fe99b3-8a33-4c11-bd86-2a8752f80b52.png"/>
    <h4 align="center">Usuário visualizando suas receitas</h4>
    <img src="https://user-images.githubusercontent.com/62727519/177563342-bb9b5c66-815b-49d7-9783-ddf9c9138a20.png"/>
    <h4 align="center">Home com receitas aprovadas pelo mod</h4>
    <img src="https://user-images.githubusercontent.com/62727519/177563606-f6bfcfa5-58d4-4e54-a4ec-c3b7ee48dcea.png"/>
<div/>

### Certificado

<img src="https://user-images.githubusercontent.com/62727519/177563947-3ad588a9-bdcf-4b6d-91ff-9864b23ddeb2.png"/>
<img src="https://user-images.githubusercontent.com/62727519/177564117-8bf02fd6-663a-47bf-8598-6b65b7952401.png"/>