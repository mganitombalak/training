import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ModalComponent } from './components/modal/modal.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [ModalComponent],
  exports:[CommonModule,ModalComponent]
})
export class SharedModule { }
