import { Injectable } from '@angular/core';
import { INaceModel } from '../../../common/entity/INaceModel';
import { BaseService } from '../../../common/service/BaseService';
import { GlobalSettingsService } from '../../../services/global-settings.service';

@Injectable()
export class NaceService extends BaseService<INaceModel> {
  constructor(protected globalSettings:GlobalSettingsService) { 
    super(globalSettings);
    this.controller="nace";
  }
}
