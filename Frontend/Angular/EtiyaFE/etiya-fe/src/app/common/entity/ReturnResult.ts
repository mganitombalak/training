export class ReturnResult<T>{
    resultType:number,
    resultValue:T[],
    requestContinuation:string,
    humanReadableMessage:string[],
    totalRecordCount:number
}