import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NaceDetailsComponent } from './nace-details.component';

describe('NaceDetailsComponent', () => {
  let component: NaceDetailsComponent;
  let fixture: ComponentFixture<NaceDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NaceDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NaceDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
