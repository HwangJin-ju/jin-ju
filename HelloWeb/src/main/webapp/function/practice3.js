//practice3

const person1 = {
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

const newPersons = persons.map(function(val, idx) { // map: 리턴해준 값을 새로운 배열에 담아줌
  let newObj = {} // 오브젝트 타입을 선언
  newObj.index = idx+1 // 오브젝트의 속성(필드)들을 추가
  newObj.fName = val.fullName
  newObj.age = val.age
  newObj.height = val.height

  return newObj // 리턴 구문이 없으면 undefined만 리턴함
})  

console.log(newPersons)

// 함수정의문으로 테이블 만드는 함수를 만듦 
function tableList(personAry) {
  document.write('<table border=1>')
  document.write('<tr><th>순번</th><th>이름</th><th>나이</th><th>키</th>')
  for(let person of personAry) { //바깥 for문 : personAry에 들어있는 건수만큼 = 라인을 생성
    document.write('<tr>')
    for(let field in person) { //안쪽 for문 : td 역할 = 칼럼 생성
      document.write(`<td>${person[field]}</td>`)
    }
    document.write('</tr>')
  }
  document.write('</table>')
}

// 함수 호출해서 실행 (만들기만 한다고 실행되는 게 아님)
tableList(newPersons)