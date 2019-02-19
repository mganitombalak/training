import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NopaymentComponent } from './nopayment.component';

describe('NopaymentComponent', () => {
  let component: NopaymentComponent;
  let fixture: ComponentFixture<NopaymentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NopaymentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NopaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
