import './ListaSuspensa.css'

const ListaSuspensa = (props) =>{
    
    const aoAlterar = (evento) =>{
        props.aoDigitar(evento.target.value)
    }

    return(
        <div className='lista-suspensa'>
            <label>{props.label}</label>
            <select value={props.valor} onChange={aoAlterar} required={props.obrigatorio}>
                <option value=""></option>
                {props.itens.map(item => <option key={item}>{item}</option>)}
            </select>
        </div>
    )
}

export default ListaSuspensa;
