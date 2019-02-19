import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CreditsRoutingModule } from './credits-routing.module';
import { AwaitingPaymentComponent } from './components/awaiting-payment/awaiting-payment.component';
import { PaymentWithProblemsComponent } from './components/payment-with-problems/payment-with-problems.component';
import { NopaymentComponent } from './components/nopayment/nopayment.component';

@NgModule({
  declarations: [AwaitingPaymentComponent, PaymentWithProblemsComponent, NopaymentComponent],
  imports: [
    CommonModule,
    CreditsRoutingModule
  ]
})
export class CreditsModule { }
