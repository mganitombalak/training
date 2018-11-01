import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NaceRoutingModule } from './nace-routing.module';
import { NaceComponent } from './components/nace/nace.component';
import { NaceService } from './services/nace.service';

@NgModule({
  imports: [
    CommonModule,
    NaceRoutingModule
  ],
  providers: [NaceService],
  declarations: [NaceComponent]
})
export class NaceModule { }
