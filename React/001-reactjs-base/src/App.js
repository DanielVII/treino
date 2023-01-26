import { useState } from 'react';
import Banner from './componentes/Banner'
import Formulario from './componentes/Formulario';
function App() {

  const [funcionarios, setFuncionarios] = useState([])

  const aoNovoFuncionarioAdicionado = (funcionario)=>{
    setFuncionarios([...funcionarios, funcionario])
    console.log(funcionario)
  }

  return (
    <div className="App">
      <Banner/>
      <Formulario aoFuncionarioCadastrado={aoNovoFuncionarioAdicionado}/>
    </div>
  );
}

export default App;
