import { TestBed } from '@angular/core/testing';

import { LeavepageService } from './leave-page/leavepage.service';

describe('LeavepageService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LeavepageService = TestBed.get(LeavepageService);
    expect(service).toBeTruthy();
  });
});
