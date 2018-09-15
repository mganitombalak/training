import { NaceModule } from './nace.module';

describe('NaceModule', () => {
  let naceModule: NaceModule;

  beforeEach(() => {
    naceModule = new NaceModule();
  });

  it('should create an instance', () => {
    expect(naceModule).toBeTruthy();
  });
});
