import './CampoTexto.css'

const CampoTexto = (props) => {
    
    const aoAlterar = (evento) =>{
        props.aoDigitar(evento.target.value)
    }

    return(
        <div className="campo-texto">
            <label>{props.label}</label>
            <input value={props.valor} onChange={aoAlterar} required={props.obrigatorio} placeholder={props.placeholder}/>
        </div>
    )
}

export default CampoTexto