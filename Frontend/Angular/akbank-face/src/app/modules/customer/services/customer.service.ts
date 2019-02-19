import { Injectable } from '@angular/core';
import { ICustomerModel } from 'src/app/models/ICustomerModel';
import { BaseService } from 'src/app/common/services/BaseService';

@Injectable()
export class CustomerService extends BaseService<ICustomerModel>  {

  constructor() {
    super();
  }
}
