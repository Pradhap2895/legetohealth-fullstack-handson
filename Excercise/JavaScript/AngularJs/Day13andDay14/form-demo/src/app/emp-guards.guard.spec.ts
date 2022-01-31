import { TestBed } from '@angular/core/testing';

import { EmpGuardsGuard } from './emp-guards.guard';

describe('EmpGuardsGuard', () => {
  let guard: EmpGuardsGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(EmpGuardsGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
