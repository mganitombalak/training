import { takeEvery, call, put } from 'redux-saga/effects';
import { ACTION_LOAD_DATA, TYPE_CARS, setDataActionCreator } from '../actions';
import axios from 'axios';
export default function* sagaSetup() {
    console.log("Saga middleware has been started.");
    yield takeEvery(ACTION_LOAD_DATA, loadData);

}

function* loadData(action) {
    try {
        console.log("saga load data");
        let result = yield call(sendRequest);
        yield put(setDataActionCreator(TYPE_CARS,result));
    }
    catch (e) {
        console.log(e);
    }
}

const sendRequest = () => {
    try {
        console.log("send request");
        return axios.get("https://www.jsonstore.io/2bce63b869ccae0ebf6206436696a1cd38052c5aad805242cb43af3fee72abc6")
            .then(r => r.data.result)
            .catch(e => e);

    }
    catch (e) {
        return e;
    };
}