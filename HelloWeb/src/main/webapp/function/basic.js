//basic.js
// 1. 함수선언식으로 정의
function sum(num1 , num2) { // let sum = function (num1, num2)
  console.log(num1, num2);
  return num1 + num2; // 이 반환값이 없으면 undefined로 나온다 반환값을 또 다른 변수에 담음
}
let result = sum(10, 20);
console.log(`결과는 ${result}`)

let myfnc = function(val1, val2) {
  var myVal = 10
  return val1 + val2 + myVal
}
console.log(typeof myfnc, myfnc)
result = myfnc(10, 20)
console.log(result)

// 2. 함수표현식으로 정의
// let sum = myfnc ->위에서 이미 선언된 sum이 있어서 불가능
let mysum = myfnc; // myfnc이 참조하는 값을 mysum도 참조한다 -> 둘다 function을 참조
result = mysum(20,30)
console.log(result)


const person = { //object 타입의 person이라는 변수 key와 value로 복합적인 데이터를 갖는다
  fullName: 'Hong',
  age: 20,
  height: 175.3
}
const person1 = {
  fullName: 'Hwang',
  age: 22,
  height: 178.4
}
const person2 = {
  fullName: 'Park',
  age: 25,
  height: 165.3
}
// 함수표현식으로 만든 myinfo
let myinfo = function (obj) {
  var info = `${obj.fullName}이고 나이는 ${obj.age}이고 키는 ${obj.height}입니다`
  return info
}
// 만든 함수를 출력하는 법
result=myinfo(person)
console.log(result)

// 배열을 활용하여 각각의 요소들을 출력
const persons=[person, person1, person2]
for(let person of persons) { //persons 배열 안에 있는 값들을 받아오는 person 변수
  let result=myinfo(person) //myinfo 함수를 활용하여 결과값을 result에 받아옴
  console.log(result)
}
console.clear()

// 자바스크립트에서는 문자열, 숫자, boolean, 배열 등을 매개값으로 사용 가능하다
// 함수도 매개값으로 사용이 가능하다
persons.forEach(function (val, ind, ary) { //배열이 갖고 있는 각각의 요소를 가지고 function수행
  // console.log(val, ind, ary)
  console.log(myinfo(val))
})  

console.clear()

let funcParam = (val, ind, ary) => {// 화살표함수. function은 빼고 매개변수와 실행블럭만 남김 (람다식처럼 간단하게)
  console.log(myinfo(val))
}
persons.forEach(funcParam) // 메소드의 매개값으로 활용되는 함수 => 콜백함수