// string/basic2.js

// indexOf(), lastIndexOf() : 찾을 문자열의 위치인덱스 반환
let result = '안녕하세요 홍길동입니다'.indexOf('홍길둥') // indexOf() : 찾는 값이 있으면 해당값의 인덱스 값, 없으면 -1을 리턴
result = '안녕하세요 홍길동입니다, 대구의 홍길동입니다'.lastIndexOf('홍길동') // lastIndexOf():뒤에서부터 찾음
result = '안녕하세요 홍길동입니다, 서울의 홍길동, 대구의 홍길동입니다'.indexOf('홍길동', 15) //특정위치부터 나오는 값 찾기 

//부산의 홍길동 찾기
let str1 = '안녕하세요 홍길동입니다, 서울의 홍길동, 부산의 홍길동, 대구의 홍길동입니다' 
let position = str1.indexOf('부산') // 부산이라는 문자의 위치 인덱스를 리턴해서 position 변수에 담음
result = str1.indexOf('홍길동', position)

//charAt(인덱스) : 그 인덱스 위치에 있는 문자 반환
let str2 = str1.charAt(result)
console.log(str2)

//toLowerCase(), toUpperCase() : 문자변경
let str3 = 'Lorem ipsum DOLOR sit amet consectetur dolor'
console.log(str3.toUpperCase().toLowerCase())

// includes('찾을 문자열') : true/false cf. indexOf는 있으면 인덱스 값 없으면 -1 반환
result = str3.includes('dolor')
console.log(result) // true
result = str3.includes('dolors')
console.log(result) // false

// search('찾을 문자열') 추가 기능 : search(정규표현식) 찾을 문자열의 인덱스 반환
// 정규표현식 오브젝트 / / or (new RegEx()), 배열 오브젝트 [] or (new Array(1,2)) -> 후자는 추천하지 않음
result = str3.search('dolor') // 대소문자가 달라서 -1 리턴 
result = str3.toLowerCase().search('dolor') // 대소문자 상관없이 찾는 법 1.소문자로 전부 바꿔서 dolor 찾기
result = str3.search(/dolor/i) // 방법 2. /표현식/ 뒤에 i : 대소문자 상관없이 ig : 대소문자상관없이 나오는 것마다 다 찾아오기

console.log(result)

// match('찾을 문자열') : 찾을 문자열이 존재하면 문자열(여러개 있으면 첫번째), 없으면 null을 반환
let str4 = 'bad MORNING, goodmorning, GOOD AFTERNOON, good evening, and good night'
result = str4.match('good')
result = str4.match(/good\s\w+/ig) // g : 있는 거 다 찾아오기 s: 공백 w: 문자 하나 (뒤에 + 붙이면 문자 하나 이상 가져오기)
console.log(result)

// replace('찾을 문자열', '바꿀 문자열')
result = str4.replace('good', 'better')
result = str4.replace(/good/gi, 'better')
result = str4.replace(/\W/g, '-') // W : 문자 이외 d : 숫자 D : 숫자 이외
result = 'morning1 morning12 morning123'.replace(/\d/g, '') // 숫자만 사라짐
result = 'morning1 morning12 morning123'.replace(/\D/g, '') // 문자만 사라짐
console.log(result)

let sso = ['970101-1234567', '970101 2234567', '9701013234567','970101/4234567']
result = sso.forEach(num => console.log(num.replace(/\D/g, ''))) //숫자 아닌 거 다 가져와서 숫자만 남음

// 문자열 합치기 : +, concat()
console.log('hello' + ' world')
console.log('hello'.concat(' world', '!!', ' welcome')) // 합치고 싶은 만큼 콤마로 구분해서 쓰면 됨
