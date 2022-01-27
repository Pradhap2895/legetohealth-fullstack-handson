import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppDataBindingComponent } from './app-data-binding.component';

describe('AppDataBindingComponent', () => {
  let component: AppDataBindingComponent;
  let fixture: ComponentFixture<AppDataBindingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppDataBindingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppDataBindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
