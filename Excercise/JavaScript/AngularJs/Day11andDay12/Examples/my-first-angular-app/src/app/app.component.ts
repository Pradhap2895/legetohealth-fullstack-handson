import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-angular-app';
  users=[{name:'Alex', gender: 'Male'},
  {name:'Sonia', gender: 'FeMale'},
  {name:'Sofia', gender: 'FeMale'},
{name:'Bruce', gender: 'Male'},]
}
