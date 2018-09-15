import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CompanyRoutingModule } from './company-routing.module';
import { CompanyComponent } from './components/company/company.component';
import { CompanyService } from './services/company.service';

@NgModule({
  imports: [
    CommonModule,
    CompanyRoutingModule
  ],
  providers:[CompanyService],
  declarations: [CompanyComponent]
})
export class CompanyModule { }
