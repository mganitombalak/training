import React from 'react';
import Routes from './routes';
import TopMenu from './sharedComponents/navigation/TopMenu';
import { BrowserRouter } from 'react-router-dom';

import { createStore, combineReducers, applyMiddleware } from 'redux'
import createSagaMiddleware from 'redux-saga';
import { Provider } from 'react-redux';
import { rootSaga } from './modules/common/sagas';

import AccountsReducers from './modules/accounts/reducers';
import NaceReducers from './modules/naces/reducers';

const combinedReducers = combineReducers({
  accounts: AccountsReducers,
  naces: NaceReducers
});
const myFirstSagaMiddleWare = createSagaMiddleware();
const globalStore = createStore(combinedReducers, applyMiddleware(myFirstSagaMiddleWare));
myFirstSagaMiddleWare.run(rootSaga);
export default () => (
  <BrowserRouter>
    <div>
      <TopMenu />
      <Provider store={globalStore}>
        <Routes />
      </Provider>
    </div>
  </BrowserRouter>
);
