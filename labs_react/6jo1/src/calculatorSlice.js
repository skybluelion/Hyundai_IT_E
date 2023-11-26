import { configureStore, createSlice } from '@reduxjs/toolkit';

const calculatorSlice = createSlice({
  name: 'calculator',
  initialState: {
    result: 0,
  },
  reducers: {
    add: (state, action) => {
      state.result += action.payload;
    },
    subtract: (state, action) => {
      state.result -= action.payload;
    },
    multiply: (state, action) => {
      state.result *= action.payload;
    },
    divide: (state, action) => {
      state.result /= action.payload;
    },
    reset: (state) => {
      state.result = 0;
    },
  },
});

const store = configureStore({
  reducer: calculatorSlice.reducer,
});

export const { add, subtract, multiply, divide, reset } = calculatorSlice.actions;

export default store;
