import { Component, OnInit } from '@angular/core';
import { ICustomerModel } from 'src/app/models/ICustomerModel';
import { IModalComponent } from 'src/app/common/IModalComponent';

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent implements OnInit, IModalComponent {
  Model: ICustomerModel;
  Bind(data: any) {
    this.Model = data;
  }
  constructor() { }
  ngOnInit() {
  }

}
