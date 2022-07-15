<h1 align="center">Boas práticas no Django: apps, pastas e paginação</h1>
<p align="center">
Esse projeto é uma extensão do 003. Nele foi terminado o CRUD das receitas do site, adicionando Delete e Edit, que faltavam. Além disso, foi implementado paginação para  melhorar a navegação. Já na parte dos arquivos foi feito uma melhor organização para encontrar os Apps, também foi feito modularização dos Métodos. Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
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
    <h4 align="center">Botões de Deletar e Editar</h4>
    <img src="https://user-images.githubusercontent.com/62727519/179236467-0fc83c2f-094e-4748-b918-743c01259dac.png"/>
    <h4 align="center">Tela para editar a receita</h4>
    <img src="https://user-images.githubusercontent.com/62727519/179237404-8b17234a-c97b-4ed6-b658-3554ee06e6c4.png"/>
    <h4 align="center">Receita editada</h4>
    <img src="https://user-images.githubusercontent.com/62727519/179239038-e566c57f-0bfe-4520-9576-cdaf47eefef8.png"/>
    <h4 align="center">Paginação do site</h4>
    <img src="https://user-images.githubusercontent.com/62727519/179240613-63281116-d449-4aad-be2e-d9e3a55dc4de.png"/>
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

<img src="https://user-images.githubusercontent.com/62727519/179242059-6606634b-fae0-4c40-802a-c8b5dec3eed6.png"/>
<img src="https://user-images.githubusercontent.com/62727519/179242236-2d01ad05-3dcd-4bb7-a28d-ed68c70be029.png"/>