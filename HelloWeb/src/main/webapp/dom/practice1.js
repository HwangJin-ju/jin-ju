// dom/practice1.js

document.addEventListener('DOMContentLoaded', function () {
  let ulTag = document.createElement('ul') // <ul></ul>
  let liTag = document.createElement('li') //<li></li>
  liTag.innerHTML = '아이스아메리카노' // <li>아아</li>
  ulTag.appendChild(liTag) // <ul><li>아아</li><ul> 

  liTag = document.createElement('li') //<li></li>
  liTag.innerHTML = '카페라떼' // <li>카페라떼</li>
  ulTag.appendChild(liTag) // <ul><li>아아</li><li>카페라떼</li><ul>

  liTag = document.createElement('li') //<li></li>
  liTag.innerHTML = '레몬에이드' // <li>레몬에이드</li>
  ulTag.appendChild(liTag) // <ul><li>아아</li><li>카페라떼</li><li>레몬에이드</li><ul>

  // console.log(ulTag)

  let divShow = document.getElementById('show')
  divShow.appendChild(ulTag)


  // for(let i = 0; i< menus.length; i++) {
  //   let li = document.createElement('li')
  //   li.innerHTML = menus[i]
  //   ul.appendChild(li)
  // }

  
  let menus = ['아이스아메리카노', '카페라떼', '레몬에이드']
  menus.forEach(function (i) {
    ul1 = document.createElement('ul')
    li1 = document.createElement('li')
    li1.innerHTML = menus[i]
    ul1.appendChild(li1)
  })

  console.log(ul1)

})