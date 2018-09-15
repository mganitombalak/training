import { Injectable } from '@angular/core';

@Injectable()
export class GlobalSettingsService {
  ApiBaseURL = 'baseUrl';
  constructor() {
    Object.freeze(this);
  }
}
