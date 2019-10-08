import { TestBed } from '@angular/core/testing';

import { EmployeeLeaveHistoryService } from './employeeleavehistory/employeeleavehistory.service';

describe('EmployeeLeaveHistoryService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmployeeLeaveHistoryService = TestBed.get(EmployeeLeaveHistoryService);
    expect(service).toBeTruthy();
  });
});
