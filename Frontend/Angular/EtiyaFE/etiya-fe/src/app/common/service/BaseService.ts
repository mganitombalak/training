import { GlobalSettingsService } from '../../services/global-settings.service';
import { ReturnResult } from '../entity/ReturnResult';
import { isNullOrUndefined } from 'util';
import { ajaxGet, AjaxResponse, ajaxPut, ajaxDelete, ajaxPost } from 'rxjs/internal/observable/dom/AjaxObservable';
import { Observable, pipe, of } from 'rxjs';
import { retry, catchError } from 'rxjs/internal/operators';

export class BaseService<T> {

  private readonly emptyResult: ReturnResult<T> =
    {
      resultType: 1,
      resultValue: null,
      totalRecordCount: 0,
      requestContinuation: null,
      humanReadableMessage: ['Oops']
    };
  protected controller: string;
  constructor(protected globalSettings: GlobalSettingsService) { }

  Read(page?: number,
    requestContinutation?: string,
    limit?: number): Observable<ReturnResult<T>> {
    const url = this.globalSettings.ApiBaseURL +
      this.controller + '/?' +
      (isNullOrUndefined(page) ? '' : 'p=' + page + '&') +
      (isNullOrUndefined(requestContinutation) ?
        '' :
        'rc=' + requestContinutation + '&') +
      (isNullOrUndefined(limit) ? '' : 'l=' + limit);

    return new Observable<ReturnResult<T>>(o => {
      ajaxGet(url)
        .pipe(retry(3),
          catchError((e, v) => {
            o.error(e);
            o.complete();
            return of(this.emptyResult);
          }))
        .subscribe(
          (ajaxRes: AjaxResponse) => o.next(ajaxRes.response as ReturnResult<T>),
          e => o.error(e),
          () => o.complete());

    });
  }
  getById(Id: number) {
    console.log('entity getbyid request');
  }
  deleteById(Id: number) {
    return new Observable<ReturnResult<T>>(o => {
      ajaxDelete(this.globalSettings.ApiBaseURL +
        this.controller + '/' + Id)
        .pipe(retry(3),
          catchError((e, v) => {
            o.error(e);
            o.complete();
            return of(this.emptyResult);
          }))
        .subscribe(
          (ajaxRes: AjaxResponse) =>
            o.next(ajaxRes.response as ReturnResult<T>),
          e => o.error(e),
          () => o.complete());
    });
  }
  add(entity: T) {
    return new Observable<ReturnResult<T>>(o => {
      ajaxPost(this.globalSettings.ApiBaseURL +
        this.controller,
        JSON.stringify(entity),
        { 'Content-Type': 'application/json' })
        .pipe(retry(3),
          catchError((e, v) => {
            o.error(e);
            o.complete();
            return of(this.emptyResult);
          }))
        .subscribe(
          (ajaxRes: AjaxResponse) =>
            o.next(ajaxRes.response as ReturnResult<T>),
          e => o.error(e),
          () => o.complete());

    });
  }
  update(entity: T): Observable<ReturnResult<T>> {
    return new Observable<ReturnResult<T>>(o => {
      ajaxPut(this.globalSettings.ApiBaseURL +
        this.controller,
        JSON.stringify(entity),
        { 'Content-Type': 'application/json' })
        .pipe(retry(3),
          catchError((e, v) => {
            o.error(e);
            o.complete();
            return of(this.emptyResult);
          }))
        .subscribe(
          (ajaxRes: AjaxResponse) =>
            o.next(ajaxRes.response as ReturnResult<T>),
          e => o.error(e),
          () => o.complete());

    });
  }
}
