import { Injectable } from '@angular/core';
import { ICompanyModel } from '../../../common/entity/ICompanyModel';
import { BaseService } from '../../../common/service/BaseService';
import { GlobalSettingsService } from '../../../services/global-settings.service';

@Injectable()
export class CompanyService extends BaseService<ICompanyModel> {
  constructor(protected globalSettings:GlobalSettingsService) { 
    super(globalSettings);
    this.controller="company";
  }
}
