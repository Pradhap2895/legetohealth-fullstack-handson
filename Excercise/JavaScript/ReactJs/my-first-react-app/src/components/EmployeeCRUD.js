import React, {Component} from 'react';
import axios from 'axios';

export class EmployeeItems extends React.Component{

    constructor(props){
        super(props);
        this.state={employees:[]}
    }

    handleRefresh =(event)=>{
        let url='http://localhost:9090/employeeAll';

        axios.get(url)
        .then((response)=> this.setState({employees : response.data}))
        .catch((err)=>console.log(err))
        
       /* this.setState({
            employees:[{id:100, name:"Alex"},{id:200,name:"Kumar"}]
        }); */

    }
    
    render(){
        return(<div>
            <h2>Employees List</h2>
            <button className='btn btn-primary ' onClick={this.handleRefresh}>Refresh</button>
          
            <table className='table table-striped'>
                <thead>
                    <tr>
                        <th>Sl No</th>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Salary</th>
                    </tr>
                </thead>
                <tbody>
                    {this.state.employees.map((item,index)=><tr key={item.id}>
                        <td>{index+1}</td>
                        <td>{item.id}</td>
                        <td>{item.name}</td>
                        <td>{item.salary}</td>
                    </tr>)}
                </tbody>

            </table>
        </div>)

    }
}



export class EmployeeStore extends React.Component{

    constructor(props){
        super(props);
        this.state={name:'', salary:''};
    }

    handleSubmit = (event)=>{
        event.preventDefault();
       let name=this.state.name;
      let salary = this.state.salary;

      
      let url=`http://localhost:9090/employee/${name}/${salary}`;

      axios.post(url)
      .then((response)=> <EmployeeItems />)
      .catch((err)=>console.log(err))
    }

    handleChange=(event)=>{
       this.setState({[event.target.name]:event.target.value});
    }
    render(){
        return (<div>
            <h3>Employee Store Form</h3>
            <form onSubmit={this.handleSubmit}>
                <label className='label'>
                    Name <input type='text' name='name' autoComplete='off'
                     onChange={this.handleChange}></input>
                </label>
                <br />
                <label className='label'>
                    Salary <input type='number' name='salary' autoComplete='off'
                     onChange={this.handleChange}></input>
                </label>
                <br />
                <button type='submit' className='btn btn-primary'>Submit</button>
            </form>
            <div>
                Name: {this.state.name}, Salary: {this.state.salary}
            </div>
        </div>)
    }

}



export class EmployeeUpdate extends React.Component{

    constructor(props){
        super(props);
        this.state={_id:'', name:'', salary:''};
    }

    handleSubmit = (event)=>{
        event.preventDefault();
    }

    handleChange=(event)=>{
       this.setState({[event.target.name]:event.target.value});
    }
    render(){
        return (<div>
            <h3>Employee Update Form</h3>
            <form onSubmit={this.handleSubmit}>
            
                <label>
                    Name <input type='text' name='name' autoCorrect='off'
                     onChange={this.handleChange}></input>
                </label>
                <br />
                <label>
                    Salary <input type='number' name='salary' autoCorrect='off'
                     onChange={this.handleChange}></input>
                </label>
                <br />
                <button type='submit' className='btn btn-primary'>Update</button>
            </form>
            <div>
                Id: {this.state._id}, Name: {this.state.name}, Salary: {this.state.salary}
            </div>


        </div>)
    }

}






/*  <label>
                    Id <input type='number' name='_id' autoCorrect='off'
                     onChange={this.handleChange}></input>
    </label>*/