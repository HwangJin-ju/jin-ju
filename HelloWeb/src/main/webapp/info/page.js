// page.js
console.log(member1); // main에 가 보면 object.js도 있어서 따로 여기서 선언하지 않아도 된다 
// 전역 변수를 같이 쓰게됨

let field = 'fullName';
console.log(member1.fullName) //log(object 타입의 변수 이름.속성이름)
console.log(member2['fullName']) // 위와 같은 결과
console.log(member3[field]); // 변수를 하나 더 선언해서 변수에 풀네임을 담음. 
// 이 방법을 기억할 것. 표현을 간단하게 하기 위해서.

// 배열요소를 반복적으로 읽어올 때는 for of를 사용할 것                             
for (let member of members) {
  console.log(`이름은 ${member[field]}이고 나이는 ${member['age']} 점수는 ${member['age']}`)
}

// 오브젝트의 속성(필드)을 반복적으로 읽어올 때는 for in을 사용할 것
for (let prop in member1) {
  console.log(`${prop} => ${member1[prop]}`);
} // 멤버1의 속성을 다 가져옴

// 각 배열요소의 각 필드를 출력
document.write('<table border=1>');
let fields = ['fullName', 'score', 'age']
for (let member of members) { //멤버의 수만큼 반복
  document.write('<tr>');
  for (let prop of fields) {
    console.log(`${prop} => ${member[prop]}`)
    document.write(`<td>${member[prop]}</td>`)
  }
  document.write('<td><button>클릭</button></td>')
  document.write('<td><input type=checkbox></td>')
  document.write('</tr>')
  console.log(`---------------------------------`)
}
document.write('</table>')