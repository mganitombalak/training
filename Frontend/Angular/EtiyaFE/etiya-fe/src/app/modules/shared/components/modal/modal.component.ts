import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  @Input('ModalId') ModalId: string;
  @Input('ModalTitle') ModalTitle: string;
  // @Input('ButtonOptions') ButtonOptions: ModalButtonOptions;
  // @Input('ModalContentComponent') ModalContentComponent: ModalContentComponent;


  constructor() { }

  ngOnInit() {
  }

}
