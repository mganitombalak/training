import { Injectable } from '@angular/core';
import { INaceModel } from 'src/app/models/INaceModel';
import { BaseService } from 'src/app/common/services/BaseService';

@Injectable()
export class NaceService extends BaseService<INaceModel> {

  constructor() {
    super();
    console.log("Nace service has been initialized.");
  }
}
