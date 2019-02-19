import { Component, OnInit, Input, OnChanges, SimpleChanges, ViewChild, ComponentFactoryResolver } from '@angular/core';
import { ModalContentHostDirective } from 'src/app/common/directive/ModalContentHost.directive';
import { ModalContent } from 'src/app/common/ModelContent';
import { IModalComponent } from 'src/app/common/IModalComponent';

@Component({
  selector: 'app-ak-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit, OnChanges {

  @Input('ModalId') ModalId: string;
  @Input('ModalTitle') ModalTitle: string;
  @Input('ModalContent') ModalContent: ModalContent;
  @ViewChild(ModalContentHostDirective) modalContentHost: ModalContentHostDirective;

  constructor(private componentFactory: ComponentFactoryResolver) { }

  ngOnInit() {
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (this.ModalContent) {
      const viewContainerRef = this.modalContentHost.viewContainerRef;
      viewContainerRef.clear();
      const componentFactory = this.componentFactory.resolveComponentFactory(this.ModalContent.componentType);
      const componentRef = viewContainerRef.createComponent(componentFactory);
      (<IModalComponent>componentRef.instance).Bind(this.ModalContent.data);
    }
  }

}
