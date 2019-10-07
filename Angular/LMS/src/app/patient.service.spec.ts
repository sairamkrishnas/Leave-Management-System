import { TestBed } from '@angular/core/testing';

import { PatientService } from './appointment/patient.service';

describe('PatientService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PatientService = TestBed.get(PatientService);
    expect(service).toBeTruthy();
  });
});
