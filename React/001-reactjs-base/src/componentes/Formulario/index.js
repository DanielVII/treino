import CampoTexto from "../CampoTexto"
import './Formulario.css'

const Formulario = () => {
    return (
        <section className="formulario">
            <form>
                <h2>Prencha os dados para criar o card do colaborador</h2>
                <CampoTexto label="Nome" placeholder="Digite Seu nome" />
                <CampoTexto label="Cargo" placeholder="Digite Seu cargo" />
                <CampoTexto label="Imagem" placeholder="Digite Seu endereço de imagem" />
            </form>
        </section>

    )
}

export default Formulario
