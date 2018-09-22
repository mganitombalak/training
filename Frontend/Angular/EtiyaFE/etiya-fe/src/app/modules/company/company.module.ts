import { NgModule } from '@angular/core';
import { CompanyRoutingModule } from './company-routing.module';
import { CompanyComponent } from './components/company/company.component';
import { CompanyService } from './services/company.service';
import { SharedModule } from '../shared/shared.module';

@NgModule({
  imports: [
    SharedModule,
    CompanyRoutingModule
  ],
  providers:[CompanyService],
  declarations: [CompanyComponent]
})
export class CompanyModule { }
