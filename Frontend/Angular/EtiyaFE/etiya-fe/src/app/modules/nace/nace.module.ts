import { NgModule } from '@angular/core';
import { NaceRoutingModule } from './nace-routing.module';
import { NaceComponent } from './components/nace/nace.component';
import { NaceService } from './services/nace.service';
import { SharedModule } from '../shared/shared.module';
import { NaceDetailComponent } from './components/nace-detail/nace-detail.component';

@NgModule({
  imports: [
    SharedModule,
    NaceRoutingModule
  ],
  providers: [NaceService],
  declarations: [NaceComponent, NaceDetailComponent],
  entryComponents: [NaceDetailComponent]
})
export class NaceModule { }
