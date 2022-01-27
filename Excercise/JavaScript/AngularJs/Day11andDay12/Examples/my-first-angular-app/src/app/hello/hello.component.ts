import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {

name : string ="Praveen";
salary : number = 36000;
dob : Date = new Date(1995,2,28);
status: boolean = true;
fruits: any =["Apple","Orange","Lemon","Grape"];


}
