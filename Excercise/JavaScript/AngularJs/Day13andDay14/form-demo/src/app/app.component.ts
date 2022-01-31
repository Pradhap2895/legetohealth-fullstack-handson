import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'form-demo';
  constructor(private _service: EmployeeService){}

  handleClick(): void{
    this._service.store(25);
  }

   
}
