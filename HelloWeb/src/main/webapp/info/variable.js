// variable.js

var myName = '황진주'; //string
var yourName; // undefined
myName = 100; // number
myName = true; // boolean
myName = null; // object

console.log(typeof yourName); // 변수 선언 전인데도 undefined으로 나오는 이유는 변수 선언부터
                              // 먼저 확인하는 자바스크립트의 유연한 특성 때문
var yourName = "홍길동";
console.log(typeof yourName);

// 전역변수(스크립트 변수), 지역변수(함수안 변수)

function checkInfo() {
  var myName = 'HwangJinju'; //이 함수가 끝나면 변수도 사라짐
  console.log(myName);
}

checkInfo();
console.log(myName);

// ES6 (ES2015) => let, const
// let 블럭레벨 변수선언

function info() {
  let myName = 'Hong';
  console.log(myName);
}

info();

{
  let myName = 'Hong';
  console.log(myName);
}

{
  let myName = 'Hwang';
  console.log(myName);
}

const otherName = 'Hong';
// otherName = 'Hwang'; ->쓸 수 없다

// var, let => 변수선언 단, let은 중복 선언을 허용하지 않는다
// const => 상수 선언