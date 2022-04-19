<h1 align="center">Introdução ao Django: Modelo, Rotas e Views</h1>
<p align="center">
    Minha primeira interação com Django. Nesse projeto aprendi como ter configurações diferentes para cada projeto (maquina virtual). Além de aprender sobre o ADMIN do django, que é uma ferramenta poderosíssima que consegue fazer um CRUD do DB facilmente. Também foi visto como diminuir cód repetido por meio das partials.
    Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
    <a href="https://www.linkedin.com/in/guilherme-lima-458925178/">Guilherme Lima</a>.
</p>

[![forthebadge made-with-python](http://ForTheBadge.com/images/badges/made-with-python.svg)](https://www.python.org/)

### Concluido :heavy_check_mark:

### :bookmark_tabs: Pré-requesitos

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
$ source .../path/to/001-django-start/venv/bin/activate
```

<p>Instale o Django</p>

```bash
(venv)$ pip install django
```

<p>Instale o Psycopg</p>

```bash
(venv)$ pip install psycopg2
```

<p>Seu binario</p>

```bash
(venv)$ pip install psycopg2-binary
```

### Projeto rodando ⚙️

<div align="center">
    <h4 align="center">Site</h4>
    <img src="https://user-images.githubusercontent.com/62727519/163812490-590af5b2-d8ea-41d1-b56a-d2010f79a2f6.png"/>
    <h4 align="center">Criando nova receita via ADMIN</h4>
    <img src="https://user-images.githubusercontent.com/62727519/163812802-9fa2f5ae-04a8-483a-a042-d3b24cc5aa00.png"/>
    <h4 align="center">Voltando para o site</h4>
    <img src="https://user-images.githubusercontent.com/62727519/163812937-3f0f5f3e-9aa2-4cf6-8b51-e78f8dd64992.png"/>
    <h4 align="center">Entrando na receita feita</h4>
    <img src="https://user-images.githubusercontent.com/62727519/163813126-12c869f0-74b6-4586-b7b8-d7b2214c8276.png"/>
<div/>

### Certificado

<img src="https://user-images.githubusercontent.com/62727519/163810857-f59976fa-e1fe-4b9c-a4ed-3dd4f7009de5.png"/>
<img src="https://user-images.githubusercontent.com/62727519/163811126-94ceb8b3-51da-44e0-bfd2-335826ea1d50.png"/>
