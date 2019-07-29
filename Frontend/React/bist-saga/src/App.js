import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import Header from './components/header';
import Routes from './routes'
import carsReducer from './components/cars/reducers'
import { createStore, applyMiddleware } from 'redux';
import {Provider} from 'react-redux';
import createSagaMiddleware from 'redux-saga';
import sagaSetup from './sagas';
const sagaMiddleware = createSagaMiddleware();
const store = createStore(carsReducer,applyMiddleware(sagaMiddleware));
sagaMiddleware.run(sagaSetup);
function App() {
  return (
    <BrowserRouter>
      <Header />
      <Provider store={store}>
      <Routes />
      </Provider>
    </BrowserRouter>
  );
}
export default App;
