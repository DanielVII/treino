import './Funcionario.css'

const Funcionario = ({nome, cargo, srcImg, corDeFundo}) =>{
    return(
        <div className='funcionario'>
            <div className='cabecalho' style={{backgroundColor: corDeFundo}}>
                <img src={srcImg} alt="Foto perfil"/>
            </div>
            <div className='rodape'>
                <h4>{nome}</h4>
                <h5>{cargo}</h5>
            </div>
        </div>
    )
}

export default Funcionario
