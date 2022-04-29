let data = [{
    studNo: 101,
    studName: '조수연',
    engScore: 90,
    korScore: 80
  },
  {
    studNo: 102,
    studName: '황진주',
    engScore: 88,
    korScore: 91
  },
  {
    studNo: 103,
    studName: '권가희',
    engScore: 92,
    korScore: 89
  },
  {
    studNo: 104,
    studName: '유해정',
    engScore: 92,
    korScore: 83
  }
]


// 초기화
let list = document.getElementById('list')

data.forEach(function (elem, idx, ary) {
  list.appendChild(makeTr(elem))
})

// 변경버튼 이벤트
let changeBtn = document.querySelector('input[type="button"]')
changeBtn.addEventListener('click', function (e) {
  // 대상 찾아오기
  let targetTr = document.querySelectorAll('#list>tr')
  console.log(targetTr)
  let sno = document.getElementById('sno').value
  let escore = document.getElementById('escore').value
  let kscore = document.getElementById('kscore').value

  targetTr.forEach(function (tr) {
    console.log(tr)
    if (tr.children[0].innerHTML == sno) {
      tr.children[2].innerHTML = escore // 영어점수변경
      tr.children[3].innerHTML = kscore
    }
  })
})

// function changeCallBack1(e) {

//   e.preventDefault() // 기본기능 차단
//   let sno = document.getElementById('sno').value
//   let sname = document.getElementById('sname').value
//   let escore = document.getElementById('escore').value
//   let kscore = document.getElementById('kscore').value
//   if(!(sno && sname && escore && kscore)) {
//     alert('필수값을 입력하세요')
//     return
//   }
//   // if (!sno)  {
//   //   alert('변경할 학생번호를 입력하세요')
//   //   return
//   // } else if (!sname) {
//   //   alert('변경할 학생이름을 입력하세요')
//   //   return
//   // } else if (!escore) {
//   //   alert('변경할 영어점수를 입력하세요')
//   // } else if (!kscore) {
//   //   alert('변경할 국어점수를 입력하세요')
//   // }

//   let searchTr = document.getElementById(`sno_${sno}`)
//   searchTr.children[1].innerHTML = document.getElementById('sname').value
//   searchTr.children[2].innerHTML = document.getElementById('escore').value
//   searchTr.children[3].innerHTML = document.getElementById('kscore').value

// }

// student object 한건 => /<tr><td>학번</td><td>이름</td><td>영어</td><td>국어</td></tr>
function makeTr(student) {
  let tr = document.createElement('tr')
  tr.setAttribute('id', 'sno_' + student.studNo) // 아이디값은 중복이 되면 안되니까 중복 없게 sno_ 붙임
  tr.addEventListener('click', function (e) {
    // e.stopPropagation()
    //console.log(this.children[2].innerHTML) // this하위요소 i번 인덱스에 있는 값이 뭔지 알아보기

    document.getElementById('sno').value = this.children[0].innerHTML
    document.getElementById('sname').value = this.children[1].innerHTML
    document.getElementById('escore').value = this.children[2].innerHTML
    document.getElementById('kscore').value = this.children[3].innerHTML



  }, false) // 캡처링 : 큰 요소부터 하위요소로  true: 상위에서 하위로. 디폴트값은 false (하위->상위)
  for (let field in student) { // student['studNo']
    let td = document.createElement('td')
    td.innerHTML = student[field]
    tr.appendChild(td)
  }

  let btn = document.createElement('button')
  btn.innerHTML = '삭제'
  btn.addEventListener('click', function (e) {
    e.stopPropagation() // 이벤트가 해당 요소 이외로 전파되는 것을 차단 (전파 방향은 true, false에 따라 달라짐)
    console.log(this) // e.target은 제일 하위 요소를 찾아오고 this는 바로 그 요소를 찾아옴
 e.target.parentElement.parentElement.remove()
  }, false)
  let td = document.createElement('td')
  td.appendChild(btn)
  tr.appendChild(td)


  return tr
}

//추가

let submitBtn = document.querySelector('input[type="submit"]')

submitBtn.addEventListener('click', function (e) {
  e.preventDefault()
  let sno = document.getElementById('sno').value
  let sname = document.getElementById('sname').value
  let escore = document.getElementById('escore').value 
  let kscore = document.getElementById('kscore').value 

  let obj = {};
  
  obj.studNo = sno;
  obj.studName = sname;
  obj.engScore = escore;
  obj.korScore = kscore;

  if(!(sno&&sname&&escore&&kscore)) {
    alert ('필수값을 입력하세요')
    return
  }

  list.appendChild(makeTr(obj))
  
})