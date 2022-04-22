// practice2.js
const num1 = 10; // number타입 참조할 수 있는 참조타입이 아님
const person1 = { // 실제 값을 가지는 게 아니라 이 필드값들의 주소값을 가짐 자바의 인스턴스
  fullName: 'Hong',
  age: 20,
  height: 175.3
}
const person2 = {
  fullName: 'Hwang',
  age: 22,
  height: 178.4
}
const person3 = {
  fullName: 'Park',
  age: 25,
  height: 165.3
}

const persons = [person1, person2, person3]

let avgAge = 0;
let sum = 0;
for(let person of persons) {
  sum += person.age
}
avgAge = sum / persons.length
console.log(`평균 나이는 ${avgAge}입니다`)

console.clear()

let avgAgeFnc = function(val) {
  sum += val.age  
} 

sum = 0
persons.forEach(function(val) {
  sum += val.age // val : person이 갖고 있는 값
}) 
avgAge = sum / persons.length
console.log(`평균 나이는 ${avgAge}입니다`)


sum = 0
let avgHeightFnc = function(val) {
  sum += val.height
}

persons.forEach(avgHeightFnc) 
aveHeight = sum / persons.length
console.log(`평균키: ${aveHeight}입니다`)

let tag = ""
// 이름, 나이, 키
// 이름, 나이, 키
// 이름, 나이, 키
let allPerson = function (val, idx) {
  if(idx==0) { //첫번째값
    tag += '<ul>'
  }
  tag += `<li> ${val.fullName}, ${val.age}, ${val.height} </li>`
  if(idx == persons.length -1) {
    tag += '</ul>'
  }
}
persons.forEach(allPerson) // 모든 사람 다 보는 거
console.log(tag)
document.write(tag)

let tag2 = ""
let over170 = function (val, idx) {
  if(idx==0) { //첫번째값
    tag2 += '<ul>'
  }
  if(val.height>=170)
    tag2 += `<li> ${val.fullName}, ${val.age}, ${val.height} </li>`
  if(idx == persons.length -1) {
    tag2 += '</ul>'
  }
}
persons.forEach(over170) // 170 이상만 보는 거
console.log(tag2)
document.write(tag2)