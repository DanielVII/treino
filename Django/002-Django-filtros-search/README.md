<h1 align="center">Integração de modelos no Django: Filtros, buscas e admin</h1>
<p align="center">
    Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
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
```

<p>É possivel que o Psycopg2 der erro na hora de instalar, para resolver isso é só baixar a lib:</p>
```bash
.../002-Django-filtros-search$ sudo apt install libpq-dev
```

<p>Crie o ambiente virtual "venv"</p>
```bash
.../002-Django-filtros-search$ python3 -m venv ./venv
```

<p>Entre na máquina virtual</p>
```bash
.../002-Django-filtros-search$ source .../path/to/002-Django-filtros-search/venv/bin/activate
```

<p>Instale o Django</p>
```bash
(venv).../002-Django-filtros-search$ pip install django
```

<p>Instale o Psycopg</p>
```bash
(venv).../002-Django-filtros-search$ pip install psycopg2
```

<p>Seu binario</p>
```bash
(venv).../002-Django-filtros-search$ pip install psycopg2-binary
```
