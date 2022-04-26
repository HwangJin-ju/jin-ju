//dom/practice3.js

let data = [{
  id:101,
  name: '홍길동',
  age: 20
}, {
  id:102,
  name: '김길동',
  age: 22
}, {
  id:103,
  name: '박길동',
  age: 24
}]

document.addEventListener('DOMContentLoaded', callbackFnc)

function callbackFnc() {
  // console.log(window) // dom 중에 최상위
  
  let tab = document.createElement('table')
  tab.setAttribute('border', 1)

  thead = makeHead()
  tab.appendChild(thead)

  tbody = makebody(data)
  tab.appendChild(tbody)

  document.getElementById('show').appendChild(tab)

  //추가 버튼 이벤트
  let btn = document.querySelector('button')
  btn.addEventListener('click', function () {
    let obj = {}
    let userName = document.getElementById('userName').value
    obj.name = userName
    let userAge = document.getElementById('userAge').value
    obj.age = userAge
    obj.id = 110

    document.querySelector('table>tbody').appendChild(makeTr(obj))

  })

}

function makeTr(obj) {
  let fields = ['name', 'age']

  let tr = document.createElement('tr')

  tr.setAttribute('id', obj.id)

  // name, age 필드의 개수만큼 td 생성
  fields.forEach(function (field) {

    let td = document.createElement('td')
    let name = document.createTextNode(obj[field] + `${field=="age"? "살":""}`)
    td.appendChild(name)
    tr.appendChild(td)

  })
  
  let btn = document.createElement('button') // <button>삭제</button>
  btn.innerHTML = '삭제'
  btn.addEventListener('click', deleteCallBack)
  let td = document.createElement('td')
  td.appendChild(btn)
  tr.appendChild(td)

  return tr
}

function deleteCallBack() {
 
    // evnt.target.parentElement.parentElement.remove()
    console.log(this) // event.target 이벤트를 받는 대상
    this.parentElement.parentElement.remove()
}

function makeHead() {
  let thead = document.createElement('thead')

  let tr = document.createElement('tr')
  let th = document.createElement('th')
  let text = document.createTextNode('이름')
  th.appendChild(text)
  tr.appendChild(th)

  th = document.createElement('th')
  text = document.createTextNode('나이')
  th.appendChild(text)
  tr.appendChild(th)

  th = document.createElement('th')
  text = document.createTextNode('기능')
  th.appendChild(text)
  tr.appendChild(th)


  thead.appendChild(tr)

  console.log(thead)

  return thead
}

function makebody(objAry) {
  // [{name, age}, {}]
  let tbody = document.createElement('tbody')

  objAry.forEach(function (obj) {
    // val = > {name:'', age:''} 가 한 건마다 나옴
    tbody.appendChild(makeTr(obj))

  })


  return tbody

}