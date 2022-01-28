import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-fetch-employees',
  templateUrl: './fetch-employees.component.html',
  styleUrls: ['./fetch-employees.component.css']
})
export class FetchEmployeesComponent implements OnInit {

  constructor(private _service: EmployeeService,private _builder: FormBuilder) {
    
   }

  ngOnInit(): void {
  }
  // employee = this._builder.group({
  //   id: [],name:[],salary:[]
  // })
  employees:any=undefined;

  errMsg:any=undefined;
  handleRefresh():void{
    this._service.fetchEmployees().subscribe(response=>{
      this.employees=response;
      console.log(response);
    },err => {
      this.errMsg = err.error.error;
    })
  }

}
