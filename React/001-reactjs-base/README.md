<h1 align="center">React: desenvolvendo com JavaScript</h1>
<p align="center">
    Aprendendo a Base do React.js. 
</p>
<p align="center">
    No modulo 1 foi mostrado os comando básicos pra começar: <em><strong>npx create-react-app</strong></em> e <em>npm start</em>. Além disso mostrou que a página é contruido em componentes, pequenas partes que vão se juntar no app.js pra construir a aplicação. Claro que é possivel colcoar componente dentro de componente. Também foi mostrado as propriedades, que são argumentos passados na criação da tag do componente, no cód base ela é passada como uma parâmetro e é possivel ler seus atributos como se fosse uma classe. Ex: <em><strong>props.atributo</strong></em>. Outrossim, foi mostrado a forma de exportação do componete por meio de uma constante que usa arrow function. Ex: <em><strong>const componente = () => {}</strong></em>.
</p>
<p align="center">
    No modulo 2 foi mostrado um atributo padrão das props, <em><strong>props.children</strong></em>, esse atributo vai pegar todo o conteudo que estiver entre as tags do componente. Além disso foi falado sobre a diferença entre o <em><strong>map()</em></strong> e o forEach(), o map() percorre a lista, faz algum script e retorna um componente, o foreach() só percorre e roda o script, sem retorno. Também foi mostrado como adicionar eventos, basta fazer: <em><strong>onAlgo={funçãoFeitaNoMesmoFile}</em></strong> dentro da tag desejada.
</p>
<p align="center">
    No modulo 3 foi mostrado sobre os hooks, que é usado para atualizar o estado da pag, os hooks são normalmente associados as funções com <em><strong>use</strong></em>AlgumaCoisa. O hook mostrado foi o <em><strong>useState</strong></em>, ele retorna uma variavel e uma função pra mudar essa variavel, essa variavel só vai afetar a pag se for modificada com setVar. Declaração: <em><strong>const [nomeVar, setNomeVar] = useState(varInicial)</strong></em>. Além disso foi mostrado como fazer um objeto só com variáveis: <em><strong>{var1, var2, ...}</strong></em>, a chave vai ser var1 e o seu valor vai ser o value do var1, o mesmo com var2.
</p>
<p align="center">
    No modulo 4 foi mostrado uma nova forma de lidar com as props, que é identificando elas em vez de usar só props na criação da dunção, <em><strong>em vez de (props) se usa ({nome, data, cor})</em></strong>, então é só usar esses parâmetros dentro da função. Também foi mostrada o render condicional, colocando um bool seguido de && e o que se deseja renderizar. EX: <em><strong>idade > 18 && conteudoHtml ou idade > 18 ? renderSeForTrue : renderSeForFalso</em></strong>. Também foi dito que no react não é tão feio o <em><strong>css inline</em></strong>, caso o valor css recebido for uma props, se for a situação é só usar o style dentro da tag que se deseja usar o css inline. 
</p>
<p align="center">
    No modulo 5 foi mostrado a palavra resevada <em><strong>debugger</em></strong>, usada no cod para fazer o que o seu nome já sugere. Também foi mostrado o <em><strong>Fragment</em></strong>, uma tag especial do React, ela será ignorada quando o DOM for renderizado, outra forma de declarar ela é com uma tag vazia. Além disso foi apresentado o <em><strong>MUI</em></strong>, uma biblioteca com vários componentes prontos pra serem utilizados.
</p>
<p align="center">
    Curso feito na <a href="https://cursos.alura.com.br/">Alura</a>, ministrado por
    <a href="https://www.linkedin.com/in/vinny-neves/">Vinicios Neves</a>.
</p>

### Concluido :heavy_check_mark:

### :bookmark_tabs: Pré-requesitos

Para rodar essa aplicação é necessario as seguintes ferramentas:

<ul>
    <li><a href="https://git-scm.com">Git</a></li>
    <li><a href="https://nodejs.org/en/">Node.js</a></li>
</ul>

### :gear: Colocando para funcionar

```bash
# Clone o repositorio na pasta desejada
$ git clone https://github.com/DanielVII/treino.git
```

```bash
# Acesse a pasta  onde foi feito o clone
$ cd suaPasta/
```

```bash
# Instale as dependências
$ npm install
```

```bash
# Agora é só abrir
$ npm start
```

### Resumo Aulas

<img src="React/001-reactjs-base/public/imagens/resumoAulas.png"/>
