import { Injectable } from '@angular/core';
import { BaseService } from 'src/commons/service/base-service';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class CategoryService extends BaseService {
  constructor(protected httpClient: HttpClient) {
    super(httpClient);
    this.serviceUrl = 'category';
  }
}
