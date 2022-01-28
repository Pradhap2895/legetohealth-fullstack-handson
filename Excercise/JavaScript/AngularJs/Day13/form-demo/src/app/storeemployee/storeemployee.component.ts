import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-storeemployee',
  templateUrl: './storeemployee.component.html',
  styleUrls: ['./storeemployee.component.css']
})
export class StoreemployeeComponent implements OnInit {

  constructor(private _service: EmployeeService,private _builder: FormBuilder) { }

  ngOnInit(): void {
  }

  employee = this._builder.group({
    name:['', Validators.compose([Validators.required])],
    salary:['',Validators.compose([Validators.required])]
  })

  errMsg:any=undefined;

  success:any=undefined;

  handleSubmit():void{
    this._service.store(this.employee.value).subscribe(response=>{
      console.log(response.success);
      this.success=response.success;
    },err => {
      this.errMsg = err.error.error;
    })
   // this.employee.reset();
  }

}
