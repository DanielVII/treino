const controle = document.querySelectorAll("[data-controle]");

controle.forEach( (elemento) => {
    elemento.addEventListener("click", () =>{
        manipulaDados(elemento.dataset.controle , elemento.parentElement);
    })
})

function manipulaDados(operacao, controle){
    const peca = controle.querySelector("[data-contador]");

    if(operacao == "+"){
        peca.value = parseInt(peca.value) + 1;
    }else{
        peca.value = parseInt(peca.value) - 1;
    }
}