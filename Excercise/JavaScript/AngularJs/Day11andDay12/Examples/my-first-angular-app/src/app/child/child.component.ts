import { Component, Input, EventEmitter, Output } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent  {

  @Input()
  username='Bruce';

  @Output()
  eventCounter: EventEmitter<number>=new EventEmitter<number>();
  counter:number=0;
  childCounter:number=0;
  incrementCounter(){
    this.counter+=1;
    this.eventCounter.emit(this.counter);
    this.childCounter++;
    this.counter=0;
  }
}
