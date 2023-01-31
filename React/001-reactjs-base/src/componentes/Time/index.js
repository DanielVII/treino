import Funcionario from '../Funcionario'
import './Time.css'

const Time = (props) => {
    return (
        props.funcionarios.length > 0 && <section className='time' style={{ backgroundColor: props.corSecundaria }}>
            <h3 style={{ borderColor: props.corPrimaria }}>{props.nome}</h3>
            <div className='funcioonarios'>
                {props.funcionarios.map(funcionario => <Funcionario
                    corDeFundo={props.corPrimaria}
                    key={funcionario.nome}
                    nome={funcionario.nome}
                    cargo={funcionario.cargo}
                    srcImg={funcionario.imagem}
                />)}
            </div>
        </section>
    )
}

export default Time
