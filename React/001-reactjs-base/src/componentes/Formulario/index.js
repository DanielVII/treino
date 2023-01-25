import Botao from "../Botao"
import CampoTexto from "../CampoTexto"
import ListaSuspensa from "../ListaSuspensa"
import './Formulario.css'

const Formulario = () => {
    const listaItens = [
        "Devops",
        "Front-End",
        "Back-End"
    ]

    const aoSalvar = (e) =>{
        e.preventDefault()
        console.log("Aloha")
    }

    return (
        <section className="formulario">
            <form onSubmit={aoSalvar}>
                <h2>Prencha os dados para criar o card do colaborador</h2>
                <CampoTexto obrigatorio={true} label="Nome" placeholder="Digite Seu nome" />
                <CampoTexto obrigatorio={true} label="Cargo" placeholder="Digite Seu cargo" />
                <CampoTexto label="Imagem" placeholder="Digite Seu endereço de imagem" />
                <ListaSuspensa obrigatorio={true} label="Time" itens={listaItens}/>
                <Botao>
                    Criar Card
                </Botao>
            </form>
        </section>

    )
}

export default Formulario
