import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreemployeeComponent } from './storeemployee.component';

describe('StoreemployeeComponent', () => {
  let component: StoreemployeeComponent;
  let fixture: ComponentFixture<StoreemployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoreemployeeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoreemployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
