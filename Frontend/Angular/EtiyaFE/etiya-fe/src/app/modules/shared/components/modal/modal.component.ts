import { Component, OnInit, Input, ViewChild, SimpleChange, OnChanges, ComponentFactoryResolver, SimpleChanges } from '@angular/core';
import { ModalContentHostDirective } from '../../../../common/directives/ModalContentHost.directive';
import { ModalContentComponent } from '../../../../common/entity/ModalContentComponent';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit, OnChanges {

  @Input('ModalId') ModalId: string;
  @Input('ModalTitle') ModalTitle: string;
  @Input('ModalContentComponent') ModalContentComponent: ModalContentComponent;
  @ViewChild(ModalContentHostDirective) ModalContentHost: ModalContentHostDirective


  constructor(private cfr: ComponentFactoryResolver) { }

  ngOnInit() { }

  ngOnChanges(changes: SimpleChanges) {

    if (this.ModalContentComponent) {
      const viewContainerRef = this.ModalContentHost.viewContainerRef;
      viewContainerRef.clear();
      const componentFactory =
        this.cfr.resolveComponentFactory(this.ModalContentComponent.component);
      const componentRef = viewContainerRef.createComponent(componentFactory);
    }

  }

}
