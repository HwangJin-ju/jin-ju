// practice.js
const numbers = [23, 45, 32, 55, 34, 72]

let sum = 0
let number = 0
for (let i =0; i<numbers.length; i++) {
  if (numbers[i]%2) {
    sum+= number
  }
 }
console.log(`1. 기본 for문을 썼을 때의 결과 ${sum}`)

for (let number of numbers) {
  if(number %2 ==0) {
    sum+= number
  }
}
console.log(`2. for of 썼을 때의 결과 ${sum}`)

// 표현식으로 
let evenSum = (param) => {
  console.log(param, idx)
 if(param % 2 == 0) {
   sum+= param
 }  
}


numbers.forEach((param) => { // numbers에 들어있는 요소들을 forEach를 통해서 반복을 수행 
  if(param % 2 == 0) {
    sum+= param
  }  
})

numbers.forEach((param, idx) => { // = function (param, idx) {} -> 콜백함수
  console.log(param, idx)
  if(param%2==0)  {
    sum+=param
  }
})

console.log(`합: ${sum}`)

numbers.forEach(evenSum) // forEach : 배열에 들어있는 각각에 대하여 ~한 처리를 하세요
                        // 여기서는 evenSum 함수의 정의값이됨
console.log(`합: ${sum}`)                        

let oddSum = (param, idx) => {
  console.log(param, idx)
  if(param % 2 == 1) {
    sum += param
  }
}

console.log(`합: ` + sum)