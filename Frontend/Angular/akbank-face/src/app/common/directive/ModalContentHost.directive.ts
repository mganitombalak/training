import { Directive, ViewContainerRef } from '@angular/core';

@Directive({ selector: '[appModalContentHost]'})
export class ModalContentHostDirective {
  constructor(public viewContainerRef: ViewContainerRef) { }
}
