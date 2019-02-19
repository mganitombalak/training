import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ModalComponent } from './components/modal/modal.component';
import { ModalContentHostDirective } from 'src/app/common/directive/ModalContentHost.directive';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [ModalComponent, ModalContentHostDirective],
  imports: [
    CommonModule,
    FormsModule,
  ],
  exports: [ModalComponent, CommonModule, FormsModule, ModalContentHostDirective]
})
export class SharedModule { }
