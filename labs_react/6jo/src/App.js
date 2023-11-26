import React from 'react';
import { createStore } from 'redux';
import { Provider, useSelector, useDispatch } from 'react-redux';
import store from './store';
import { up } from './counterSlice';
import { down } from './minusSlice';

function Counter() {
  const dispatch = useDispatch();
  const count = useSelector((state) => {
    console.log(state);
    return state.counter.value;
  });
  return (
    <div>
      <button
        onClick={() => {
          dispatch(up(1));
        }}
      >
        +
      </button>{' '}
      {count}
    </div>
  );
}
function Minus() {
  const dispatch = useDispatch();
  const count = useSelector((state) => {
    console.log(state);
    return state.counter.value;
  });
  return (
    <div>
      <button
        onClick={() => {
          dispatch(down(1));
        }}
      >
        -
      </button>{' '}
      {count}
    </div>
  );
}
export default function App() {
  return (
    <Provider store={store}>
      <div>
        <Counter></Counter>
        <Minus></Minus>
      </div>
    </Provider>
  );
}
