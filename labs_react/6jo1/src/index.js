import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { configureStore } from '@reduxjs/toolkit';
import calculatorReducer from './calculatorSlice';
import App from './App';

const store = configureStore({
  reducer: calculatorReducer,
});

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root'),
);
