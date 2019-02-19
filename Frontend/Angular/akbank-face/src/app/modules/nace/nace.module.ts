import { NgModule } from '@angular/core';
import { NaceRoutingModule } from './nace-routing.module';
import { NaceListComponent } from './components/nace-list/nace-list.component';
import { NaceService } from './services/nace.service';
import { NaceDetailsComponent } from './components/nace-details/nace-details.component';
import { SharedModule } from '../shared/shared.module';

@NgModule({
  declarations: [NaceListComponent, NaceDetailsComponent],
  imports: [
    SharedModule,
    NaceRoutingModule
  ],
  providers: [NaceService],
  entryComponents: [NaceDetailsComponent]
})
export class NaceModule { }
