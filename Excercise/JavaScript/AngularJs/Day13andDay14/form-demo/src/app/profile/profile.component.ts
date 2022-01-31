import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private _activatedRoute: ActivatedRoute) { }

  username=undefined;
  ngOnInit(): void {
    this._activatedRoute.parent?.params.subscribe((p:Params)=>this.username=p['un']);
  }

}
