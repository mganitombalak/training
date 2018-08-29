import axios from 'axios'
import {
    call,
    put,
    takeEvery,
    select
} from 'redux-saga/effects'
import {
    ACTION_LOADDATA,
    TYPE_ACCOUNTS,
    TYPE_NACES,
    populateData
} from '../../common/actions'
//throttle
export function* rootSaga() {
    console.log("Hi, Saga is running!");
    yield takeEvery(ACTION_LOADDATA, fecthData);
    yield takeEvery('*', logger);
}

const getData = (dataType) => {
    let uri =
        dataType === TYPE_ACCOUNTS ? "https://osgb.azurewebsites.net/api/company" :
        dataType === TYPE_NACES ? "https://osgb.azurewebsites.net/api/nace" : "";
    return axios.get(uri)
        .then(r => r.data.resultValue)
        .catch(e => e);
}

function* fecthData(action) {
    try {
        const resultData = yield call(getData,action.dataType);
        yield put(populateData(resultData,action.dataType));
    } catch (e) {
        console.log(e);
    }
}

function* logger(action) {
    const currentState = yield select();
    console.log('action:', action);
    console.log('state:', currentState);
}