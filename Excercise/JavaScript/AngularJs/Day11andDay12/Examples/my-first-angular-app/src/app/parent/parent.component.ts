import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent  {

 firstname = 'Alex';
 users= ['Sachin','Virat','Rohit','Dhoni'];

clicks: number=0;

numberOfClicks(value:number)
{
  this.clicks+=value;
}}
