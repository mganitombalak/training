import { Injectable } from '@angular/core';
import { ICategory } from './ICategory';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class ServiceService {
  constructor(private httpClient: HttpClient) { }

  getCategories(): Observable<Array<ICategory>> {
    return this.httpClient.get('http://localhost/api/category') as Observable<Array<ICategory>>;
  }
}
