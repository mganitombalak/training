import { Injectable } from '@angular/core';

@Injectable()
export class GlobalSettingsService {
  ApiBaseURL = 'https://osgb.azurewebsites.net/api/';
  constructor() {
    Object.freeze(this);
  }
}
