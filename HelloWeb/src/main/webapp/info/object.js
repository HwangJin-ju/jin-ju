// object.js
let member1 = {
  fullName: 'Hong',
  age: 20,
  score: 80
};

let member2 = {
  fullName: 'Hwang',
  age: 22,
  score: 88
}

let member3 = {
  fullName: 'Park',
  age: 25,
  score: 92
}
member1.fullName = '홍';
console.log(member1.fullName);
console.log(member1.age+member2.age);
// {key: value}, {key: value} -> 맵 타입. 이것과 비슷하다

const members = [member1, member2, member3];
// 홍의 나이는 20이고 점수는 80입니다 출력

for(let i=0; i<members.length; i++) {
  console.log(members[i].fullName + '의 나이는 '+ members[i].age + '이고 점수는 '+ members[i].score+ '입니다')
}

document.write('<h3>Hong</h3>') //매개값으로 들어온 걸 다큐먼트 영역에 쓰겠다
                                //문자값    
document.write('<ul>');
for(let i=0; i<members.length; i++) {
    document.write(`<li>${members[i].fullName}의 나이는 ' ${members[i].age} 살이고 점수는 ${members[i].score} 입니다</li>`) //변수값 
}
document.write('</ul>');
let welcome = `안녕하세요.
               반갑습니다`;
console.log(welcome); 
              