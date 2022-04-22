// object/basic.js

const member = {
  memberId: 'user1',
  memberName: 'Hong',
  getMemberName: function () { // 기능을 갖고 있는 메소드
    return `회원이름 ${this.memberName}`
  },
  setMemberName: function (name){
    this.memberName = name
  }
}

console.log(member.memberId)
member.setMemberName('Hwang')
console.log(member.getMemberName())

// 꼭 속성을 object 선언문 안에서만 부여할 수 있는 것은 아님

member.memberAge = 20 // 멤버에 속성 부여 1
delete member.memberAge // 속성 삭제
member['memberPoint'] = 1000 // 속성 부여 2
member.grade = function() { // 속성 부여 3
  if(this.memberPoint > 500) { // this는 member라는 object를 가리킨다
    return 'gold'
  } else if(this.memberPoint > 1000) {
    return 'platinum'
  }
}
console.log(member.grade())

// 다른 멤버를 하나 더 선언하려고 할 때 다시 const 해서 똑같이 추가하려고 하면 번거롬
// object 생성 방법 -> 클래스, Construct 함수
// 클래스를 통해서 만들면 메소드들을 편하게 재활용할 수 있다
class Student {
  constructor(sno, sname) { // 두 개의 매개값을 받는 생성자 (필드값 대신)
    this.sno = sno
    this.sname = sname
  }
  set mathScore(score) { // 메소드처럼 보이지만 메소드 아님 생성자에 선언되지 않은 속성을 추가하는 방법 (세처)
                         //-> 사용법도 약간 다름 속성값에 _를 붙여야 함 그렇지 않으면 자기 자신을 계속 호출함
    this._mathScore = score
  }
  get mathScore() {
    return this._mathScore // _mathScore 속성값을 읽어온다
  }
  getSno() {
    return this.sno
  }
  setSno(sno) {
    this.sno = sno //this는 constructor로 만들어지는 object
  }
}

const s1 = new Student('1111', 'Hong')
const s2 = new Student('2222', 'Hwang')
console.log(`학생번호 : ${s1.getSno()}`)
s1.engScore=80 // 클래스는 클래스대로 선언하고 만들어지 object의 속성도 따로 추가 가능
s1.mathScore = 90 // mathScore라는 setter를 호출하겠다는 의미임
console.log(s1.engScore)
console.log(s1.mathScore)

// 생성자 함수 

function Person(ssn, sname) {
  this.ssn = ssn
  this.sname = sname
  this.getInfo = function() {
    return `주민번호 ${this.ssn}, 이름 ${this.sname}`
  }
}

const p1 = new Person('981111-1111111','Hong')
const p2 = new Person('962222-2222222','Hwang')
const p3 = new Person('953333-3333333','Park')
console.log(p1.getInfo())




