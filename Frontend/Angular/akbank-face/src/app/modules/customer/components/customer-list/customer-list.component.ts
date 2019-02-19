import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { ICustomerModel } from 'src/app/models/ICustomerModel';
import { ModalContent } from 'src/app/common/ModelContent';
import { CustomerDetailComponent } from '../customer-detail/customer-detail.component';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  constructor(private customerService: CustomerService) { }

  DataModel: Array<ICustomerModel>;
  ModalTitle: string;
  ModelContent: ModalContent;
  ngOnInit() {
    this.DataModel = this.customerService.readAll(2);
  }

  onEdit(item: ICustomerModel): void {
    this.ModelContent = new ModalContent(CustomerDetailComponent, item);
    this.ModalTitle = "Update item named " + item.title;
  }
}
