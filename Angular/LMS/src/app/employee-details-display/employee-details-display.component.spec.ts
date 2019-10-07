import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeDetailsDisplayComponent } from './employee-details-display.component';

describe('EmployeeDetailsDisplayComponent', () => {
  let component: EmployeeDetailsDisplayComponent;
  let fixture: ComponentFixture<EmployeeDetailsDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeDetailsDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeDetailsDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
