import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-fectemployee',
  templateUrl: './fectemployee.component.html',
  styleUrls: ['./fectemployee.component.css']
})
export class FectemployeeComponent implements OnInit {

  constructor(private _service: EmployeeService, private _builder: FormBuilder) { }

  ngOnInit(): void {
  }

  employee = this._builder.group({
    id: [],name:[],salary:[]
  })
  emp:any=undefined;
  errorMessage:any=undefined

  handleClick(): void{
    let id =this.employee.controls['id'].value;
    this._service.fetchEmployeeId(id).subscribe(response =>{
      this.emp=response;
      this.errorMessage=undefined;;
    }, err => {
      this.errorMessage=err.error.error;
      this.emp=undefined;
    });
    this.employee.reset({});
  }

}
