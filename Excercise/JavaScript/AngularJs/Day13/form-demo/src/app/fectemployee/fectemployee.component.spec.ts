import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FectemployeeComponent } from './fectemployee.component';

describe('FectemployeeComponent', () => {
  let component: FectemployeeComponent;
  let fixture: ComponentFixture<FectemployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FectemployeeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FectemployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
