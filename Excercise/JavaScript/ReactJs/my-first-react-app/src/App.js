import logo from './logo.svg';
import './App.css';
import Greetings, { Hello } from './components/Greetings';
import Button from './components/Button';
import { Counter } from './components/Counter';
import { EmployeeItems, EmployeeStore, EmployeeUpdate } from './components/EmployeeCRUD';
import { Link, Route, Routes } from 'react-router-dom';

function Navigation(){
  return(<div className='alert alert-secondary'>
    <Link to='/store'>Store</Link>
    <br />
    <Link to='/fetchAll'>All Employees</Link>
    <br />
    <Link to='/update'>Update Employee</Link>
    </div>)

}

function App() {
 
  return (
    <div className='container-fluid'>
     <h1 className='text-center'>Welcome to react with node</h1>
      <div className='row'>
        <div className='col-5'>
          <Navigation />
        </div>
      </div>

      <div className='row'>
        <div className='col'>
          <Routes>
            <Route path='/' element={<EmployeeItems />}></Route>
            <Route path='/store' element={<EmployeeStore />}></Route>
            <Route path='/fetchAll' element={<EmployeeItems />}></Route>
            <Route path='/update' element={<EmployeeUpdate />}></Route>
          </Routes>
        </div>
      </div>
    </div>
  );
}

export default App;


/*
function User(props){
  let profile = props.profile;
  return (<div>
    <h3>Name: {profile.username},
   Age: {profile.age}, DOB: {profile.dob.toLocaleDateString()}
   </h3>
   </div>)
}

function Welcome(props){

  return (<div><h3>{props.message}</h3></div>)
}

let message = "Hello everyone";
let profile={username:"Pradhap",age:26, dob: new Date(1995,10,21)} */