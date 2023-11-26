import { useDispatch, useSelector } from 'react-redux';
import { counterSlice } from './counterSlice';

export default function App() {
  const dispatch = useDispatch();
  const count = useSelector((state) => state);

  const { increment, decrement, multiply, divide, reset } = counterSlice.actions;

  function down() {
    dispatch(decrement(number));
  }

  function reset() {
    dispatch(reset());
  }

  function up() {
    dispatch(increment(number));
  }

  function multiply() {
    dispatch(multiply(number));
  }

  function divide() {
    dispatch(divide(number));
  }

  function changeNumber(event) {
    setNumber(Number(event.target.value));
  }

  return (
    <div>
      <input type="button" value="-" onClick={down} />
      <input type="button" value="0" onClick={reset} />
      <input type="button" value="+" onClick={up} />
      <input type="button" value="*" onClick={multiply} />
      <input type="button" value="/" onClick={divide} />
      <input type="text" value={number} onChange={changeNumber} />
      <span>{count}</span>
    </div>
  );
}
