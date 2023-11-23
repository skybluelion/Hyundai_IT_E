//default
import a1 from '#labs/esm/esm01.mjs';
console.log(a1);

import a2 from '#labs/esm/esm02.mjs';
a2();

import a3 from '#labs/esm/esm03.mjs';
console.log(a3.a);
a3.fnA();

console.log('=============================');
//named
import * as mA from '#labs/esm/esm04.mjs';
console.log(mA.a);
mA.fnA();

import { a, fnA } from '#labs/esm/esm04.mjs'; //객체 구조 분해 할당
console.log(a);
fnA();

import { a as a01, fnA as fnA1 } from '#labs/esm/esm04.mjs'; //객체 구조 분해 할당
console.log(a01);
fnA1();
console.log('================================');

import { m_a, m_fnA, m_a2 } from '#labs/esm/esm05.mjs';
console.log(m_a);
console.log(m_a2);
m_fnA();
console.log('================================');

import * as objB from '#labs/esm/esm05.mjs';
console.log(objB.m_a);
console.log(objB.m_a2);
objB.m_fnA();
