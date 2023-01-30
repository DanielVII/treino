import { useState } from "react"
import Botao from "../Botao"
import CampoTexto from "../CampoTexto"
import ListaSuspensa from "../ListaSuspensa"
import './Formulario.css'

const Formulario = (props) => {

    const aoSalvar = (e) => {
        e.preventDefault()
        props.aoFuncionarioCadastrado({
            nome,
            cargo,
            imagem,
            time
        })

        setNome('')
        setCargo('')
        setImagem('')
        setTime('')
    }

    const [nome, setNome] = useState('')
    const [cargo, setCargo] = useState('')
    const [imagem, setImagem] = useState('')
    const [time, setTime] = useState('')

    return (
        <section className="formulario">
            <form onSubmit={aoSalvar}>
                <h2>Prencha os dados para criar o card do colaborador</h2>
                <CampoTexto
                    valor={nome}
                    aoDigitar={nome => setNome(nome)}
                    obrigatorio={true}
                    label="Nome"
                    placeholder="Digite Seu nome" />

                <CampoTexto
                    valor={cargo}
                    aoDigitar={cargo => setCargo(cargo)}
                    obrigatorio={true}
                    label="Cargo"
                    placeholder="Digite Seu cargo" />
                <CampoTexto
                    valor={imagem}
                    aoDigitar={imagem => setImagem(imagem)}
                    label="Imagem"
                    placeholder="Digite Seu endereço de imagem" />
                <ListaSuspensa
                    valor={time}
                    aoDigitar={time => setTime(time)}
                    obrigatorio={true}
                    label="Time"
                    itens={props.times} />
                <Botao>
                    Criar Card
                </Botao>
            </form>
        </section>

    )
}

export default Formulario
