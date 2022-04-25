// dom/basic.js

// DOM : 생성, 속성, 삭제, 부모-자식 관계 설정
// addEventListener('이벤트이름', '실행할 이벤트 핸들러')

console.log('1')            //페이지가 다 읽어들인 다음에 실행하시오 (그래서 1, 3, 2 순으로 찍힘)
document.addEventListener('DOMContentLoaded', function() { // document(바디 영역으로 생각하면 됨) event(사용자가 마우스를 움직인다든가 키보드를 입력하는 것 등) 
  console.log('2')
  let h3Tag = document.getElementsByTagName('h3') // HTMLCollection 타입이라 순번이 필요함
  console.log(h3Tag)
  h3Tag[1].innerHTML = 'HI, THERE'

  let first = document.getElementById('first') // element
  console.log(first)
  first.innerHTML = 'ALERT'

  let second = document.getElementsByClassName('first') // 컬렉션 타입이라서 하나뿐이어도 인덱스가 필요함
  second[0].innerHTML = '사과'

  // CSS의 선택자
  let list = document.querySelectorAll('ul>li')
  console.log(list)
  list[0].style.backgroundColor = 'red'
  list[1].style.backgroundColor = 'yellow'
  list[2].style.backgroundColor = 'fuchsia'
  
  
  // DOM 생성
  let newList = document.createElement('li') // <li>Mango</li>
  newList.innerHTML = 'Mango'
  console.log(newList)

  // ul 하위요소로 <li>Mango</li> 붙이기
  let ulTag = document.querySelector('ul') // 첫번째 ul 태그를 가져옴
  ulTag.appendChild(newList)
})
console.log('3')
