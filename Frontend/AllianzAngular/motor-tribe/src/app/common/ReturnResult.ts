export class ReturnResult<T> {
    totalRecordCount: number;
    resultType: number;
    resultValue: Array<T>;
    requestContinuation: string;
    humanReadableMessage: string[]; //Array<string>;
}
