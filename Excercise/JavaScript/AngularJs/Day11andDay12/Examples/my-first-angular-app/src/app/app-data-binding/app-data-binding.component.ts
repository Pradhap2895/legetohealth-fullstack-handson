import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './app-data-binding.component.html',
  styleUrls: ['./app-data-binding.component.css']
})
export class AppDataBindingComponent {

username='Alex';
toggleButton : boolean = true;
message : string ='';

handleFresh(v: string):void{
  this.username=v;
  this.toggleButton = !this.toggleButton;
}


}
