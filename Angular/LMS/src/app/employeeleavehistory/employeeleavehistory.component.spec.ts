import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeLeaveHistoryComponent } from './employeeleavehistory.component';

describe('EmployeeLeaveHistoryComponent', () => {
  let component: EmployeeLeaveHistoryComponent;
  let fixture: ComponentFixture<EmployeeLeaveHistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeLeaveHistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeLeaveHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
