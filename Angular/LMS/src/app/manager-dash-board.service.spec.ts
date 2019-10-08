import { TestBed } from '@angular/core/testing';

import { ManagerDashBoardService } from './manager-dash-board/manager-dash-board.service';

describe('ManagerDashBoardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ManagerDashBoardService = TestBed.get(ManagerDashBoardService);
    expect(service).toBeTruthy();
  });
});
