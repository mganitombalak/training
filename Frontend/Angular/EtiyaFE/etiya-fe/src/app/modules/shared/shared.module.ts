import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ModalComponent } from './components/modal/modal.component';
import { ModalContentHostDirective } from '../../common/directives/ModalContentHost.directive';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [ModalComponent,ModalContentHostDirective],
  exports:[CommonModule,ModalComponent,ModalContentHostDirective]
})
export class SharedModule { }
