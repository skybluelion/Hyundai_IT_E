//default
const a01 = require('#labs/cjs/cjs01.js');
console.log(a01);

const a02 = require('#labs/cjs/cjs02.js');
a02();

const a03 = require('#labs/cjs/cjs03.js');
console.log(a03.a);
a03.fnA();

console.log('================================');
//named
const mA = require('#labs/cjs/cjs04.js');
console.log(mA.a);
mA.fnA();

const { a, fnA } = require('#labs/cjs/cjs04.js'); //객체 구조 분해 할당
console.log(a);
fnA();
console.log('================================');

const { m_a, m_fnA, m_a2 } = require('#labs/cjs/cjs05.js');
console.log(m_a);
console.log(m_a2);
m_fnA();
console.log('================================');

if (a01 > 0) {
  const a2 = require('#labs/cjs/cjs01.js');
  console.log(a2);
}
