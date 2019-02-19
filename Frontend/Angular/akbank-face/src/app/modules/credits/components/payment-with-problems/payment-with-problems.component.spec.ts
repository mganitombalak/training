import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentWithProblemsComponent } from './payment-with-problems.component';

describe('PaymentWithProblemsComponent', () => {
  let component: PaymentWithProblemsComponent;
  let fixture: ComponentFixture<PaymentWithProblemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaymentWithProblemsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaymentWithProblemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
