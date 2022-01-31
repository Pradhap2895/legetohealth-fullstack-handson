import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { first } from 'rxjs';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-mdf-demo',
  templateUrl: './mdf-demo.component.html',
  styleUrls: ['./mdf-demo.component.css']
})
export class MdfDemoComponent {

  
 constructor(private _router: Router,private _builder : FormBuilder,private _service: EmployeeService){ }

 profile = this._builder.group({
  firstname: ['', Validators.compose([Validators.required, Validators.minLength(3)])],
  lastname: ['',Validators.compose([Validators.required, Validators.minLength(2)])]
 });

 handleSubmit(): void{
   let firstname=this.profile.controls['firstname'].value;
   if(firstname=='Alex'){
      console.log('mdf-demo='+firstname)
    sessionStorage.setItem('user', firstname);
    this._router.navigate(['success',firstname]);
   }else{
    this._router.navigate(['mdf']);
    this.profile.reset({});
   }
 }

}




// this._service.fetchEmployeeByName(firstname).subscribe(response =>{
//   console.log('mdf-demo='+firstname)
// sessionStorage.setItem('user', firstname);
// this._router.navigate(['success',firstname]);
// }, err=>{
// this._router.navigate(['mdf']);
// this.profile.reset({});
// });
