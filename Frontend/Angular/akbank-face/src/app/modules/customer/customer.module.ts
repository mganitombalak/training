import { NgModule } from '@angular/core';
import { CustomerRoutingModule } from './customer-routing.module';
import { CustomerListComponent } from './components/customer-list/customer-list.component';
import { CustomerService } from './services/customer.service';
import { SharedModule } from '../shared/shared.module';
import { CustomerDetailComponent } from './components/customer-detail/customer-detail.component';

@NgModule({
  declarations: [CustomerListComponent, CustomerDetailComponent],
  imports: [
    SharedModule,
    CustomerRoutingModule
  ],
  providers: [CustomerService],
  entryComponents: [CustomerDetailComponent]
})
export class CustomerModule { }
