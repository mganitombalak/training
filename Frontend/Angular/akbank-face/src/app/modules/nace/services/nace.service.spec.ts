import { TestBed } from '@angular/core/testing';

import { NaceService } from './nace.service';

describe('NaceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: NaceService = TestBed.get(NaceService);
    expect(service).toBeTruthy();
  });
});
