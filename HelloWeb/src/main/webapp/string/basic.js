// string/basic.js
// 문자열 vs 문자열 객체

let str1 = '문자열'
console.log(typeof str1)

let str2 = new String('문자열') // new라는 키워드로 만들어지는 건 object 타입
console.log(typeof str2) 

console.log(str1 == str2) // 비교연산자 == -> 값을 비교
console.log(str1 === str2) // 비교연산자 === -> 값 & 타입을 비교


let result = str1.substring(0, 2) // index : 0 ~ index : 2 잘라내기 (포함, 미포함)
console.log(result)
result = str2.substr(0, 2) // index : 0 크기 2만큼 잘라내기
console.log(result)

const cal1 = '1 + 2 * 3' // string -> 문자열이라 연산 불가
const cal2 = new String ('1 + 2 * 3') // object 

// eval() : 문자열 => 수식변경
console.log(eval(cal1)) // 연산 불가능한 문자열을 연산 가능하도록 eval()을 통해 수식으로 변경해줌
console.log(eval(cal2.valueOf())) // object 타입은 eval()함수를 써도 object로만 표현됨 -> valueOf() 써야 수식이 됨

// trim() : 좌우의 여백을 잘라내기
console.log(' 문자열 공백 테스트 '.trim())
console.log(' 문자열 공백 테스트 '.trimStart()) // 왼쪽 공란만 잘라내기
console.log(' 문자열 공백 테스트 '.trimStart().trimEnd()) // 왼쪽 공란 잘라내기 + 오른쪽 공란 잘라내기

// 문자열의 공백을 제거 -> 바로 쓰는 메소드가 없음 -> 배열로 만들어서 배열이 가진 메소드를 씀
result = ' 문자열 공백 테스트 '.split(' ') // split() : 매개변수에 들어온 값을 기준으로 문장을 잘라서 배열 형태로 만듦
result = result.filter(function(val){ // filter() : 매개값으로 들어오는 함수에 따라서 true값으로만 배열을 만들어줌 
  return val // [' ', '문자열', '공백', '테스트', ' '] -> '':false라서 반환 안해줌
})
console.log(result)
console.log(result.join('')) // 배열 => 문자열 변환

// 위에 거 한 번에
result = ' 문자열 공백 테스트 '.split(' ').filter(val => val).join(',')
console.log(result)

// 자바스크립트에서 boolean 값 : null, '', 0, undefined => false로 반환
if (!null) { // null은 true도 false도 아니지만 자바스크립트에서 false로 처리되므로 조건식 안에 null이 들어가도 실행됨
  console.log('false값')
}

// slice, substring, substr(Deprecated)
console.log('안녕하세요 반갑습니다.'.slice(0,-6)) // slice(포함, 미포함) : 인덱스 기준 0부터 5이전까지 잘라낸 값을 반환 마이너스값도 허용
console.log('안녕하세요 반갑습니다.'.substring(0,6)) // 마이너스 허용 안 함
console.log('안녕하세요 반갑습니다.'.substr(2,3)) // 인덱스값이 아니라 n개 잘라옴 

// toString() : 문자열로 변환
let num1 = 123
console.log(typeof num1)
num1 = num1.toString()
console.log(typeof num1)

console.log(true.toString()) // true라는 문자를 리턴

let obj = {
  key: 'Hong',
  value: 15
}
console.log(obj.toString()) // object 타입은 문자열로 변경이 안 됨
console.log(obj.key.toString()) 
console.log(obj.value.toString()) 
