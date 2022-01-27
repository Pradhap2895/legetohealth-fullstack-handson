import { Component } from "@angular/core";

@Component({
    selector: 'demo-app',
    templateUrl: './demo.component.html',
})
export class DemoComponent{
  employees: any = [{id:21,name:"pradhap",salary:69000 },
  {id:22,name:"Maha",salary:7000 },
  {id:23,name:"Karthi",salary:12000 },
  {id:24,name:"Magesh",salary:16000 }];
}