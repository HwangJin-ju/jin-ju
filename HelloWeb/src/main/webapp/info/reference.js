// reference.js

const names = ['조수연', '황진주', '권가희', '이유빈'];

for(let i=0; i<names.length; i++) {
  console.log((i+1)+'번째 이름:'+ names[i]);
}

// enhanced for -> 자바에서 for(String name : names) {}
for(let name of names) {
  console.log(name);
}

const numbers = [23, 44, 38, 12, 56];
for (let num of numbers) {
  if(num > 40) {
    console.log(num);
  }  
}

const inputs = []; // 배열 선언
for(let i=0; i<numbers.length; i++) {
  var inputValue = prompt('값을입력하세요');
  console.log(typeof inputValue, inputValue);
  inputs[i] = parseInt(inputValue);
}
// 합계, 평균
let sum = 0, avg;
for (let i = 0; i<inputs.length; i++) {
  sum+= inputs[i];
  console.log(`합은 ${sum} 입니다`)
} 



// const num = [1, 2, 3];
// const inputs2 =[];
// let sum=0;
// for(let i=0; i<num.length; i++) {
//   var inputVal = prompt('값을 입력하세요');
//   inputs2[i]=parseInt(inputVal);
//   sum+=inputs2[i]; 
//   console.log(sum);
// } 