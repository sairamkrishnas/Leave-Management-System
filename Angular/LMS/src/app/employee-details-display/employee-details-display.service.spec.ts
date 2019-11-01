import { TestBed } from '@angular/core/testing';

import { EmployeeDetailsDisplayService } from './employee-details-display.service';

describe('EmployeeDetailsDisplayService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmployeeDetailsDisplayService = TestBed.get(EmployeeDetailsDisplayService);
    expect(service).toBeTruthy();
  });
});
