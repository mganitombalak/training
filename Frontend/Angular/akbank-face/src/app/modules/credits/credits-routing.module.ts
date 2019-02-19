import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AwaitingPaymentComponent } from './components/awaiting-payment/awaiting-payment.component';
import { PaymentWithProblemsComponent } from './components/payment-with-problems/payment-with-problems.component';
import { NopaymentComponent } from './components/nopayment/nopayment.component';

const routes: Routes = [
  { path: 'awating-payment', component: AwaitingPaymentComponent },
  { path: 'payment-with-problems', component: PaymentWithProblemsComponent },
  { path: 'nopayment', component: NopaymentComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CreditsRoutingModule { }
