import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable()
export class RequestInterceptor implements HttpInterceptor {
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const requestObject = req.clone({ url: `http://localhost:8080/agileTraining/v1/${req.url}` });
    console.log(requestObject.url);
    return next.handle(requestObject);
  }
}
