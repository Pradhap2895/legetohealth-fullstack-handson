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
   employees:any=undefined;

  ngOnInit(): void {

    this._service.fetchEmployees().subscribe(response=>{
      this.employees=response;});
     
  }
  // employee = this._builder.group({
  //   id: [],name:[],salary:[]
  // })
 

}
