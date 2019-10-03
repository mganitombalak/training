import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EventEmitter } from '@angular/core';
import { IBaseResponse } from '../interface/IBaseResponse';

export class BaseService {
  reloadReqired: EventEmitter<boolean>;
  protected serviceUrl: string;
  constructor(protected httpClient: HttpClient) {
    this.reloadReqired = new EventEmitter();
  }
  find(): Observable<Array<IBaseResponse>> {
    return this.httpClient.get(this.serviceUrl) as Observable<Array<IBaseResponse>>;
  }

  create(model: FormData): Observable<IBaseResponse> {
    return this.httpClient.post(this.serviceUrl, model) as Observable<IBaseResponse>;
  }

  update(model: FormData): Observable<IBaseResponse> {
    return this.httpClient.put(this.serviceUrl, model) as Observable<IBaseResponse>;
  }

  delete(id: string): Observable<IBaseResponse> {
    return this.httpClient.delete(this.serviceUrl + '/' + id) as Observable<IBaseResponse>;
  }

}
