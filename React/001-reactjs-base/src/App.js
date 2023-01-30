import { useState } from 'react';
import Banner from './componentes/Banner'
import Formulario from './componentes/Formulario';
import Rodape from './componentes/Rodape';
import Time from './componentes/Time';
function App() {

  const [funcionarios, setFuncionarios] = useState([])

  const aoNovoFuncionarioAdicionado = (funcionario)=>{
    setFuncionarios([...funcionarios, funcionario])
    console.log(funcionario)
  }

  const times = [
    {
      nome:"Programação",
      corPrimaria:"#57c278",
      corSecundaria: "#d9f7e9"
    },
    {
      nome:"Front-end",
      corPrimaria:"#e06b69",
      corSecundaria:"#fde7e8"
    },
    {
      nome:"Back-end",
      corPrimaria:"#ffba29",
      corSecundaria:"#ffeedf"
    }
  ]

  return (
    <div className="App">
      <Banner/>
      <Formulario aoFuncionarioCadastrado={aoNovoFuncionarioAdicionado}  times={times.map(time => time.nome)}/>
      {times.map(time=> <Time
        key={time.nome} 
        nome={time.nome} 
        corPrimaria={time.corPrimaria} 
        corSecundaria={time.corSecundaria} 
        funcionarios={funcionarios.filter(funcionario => funcionario.time === time.nome)}/>)}
      <Rodape/>
    </div>

  );
}

export default App;
