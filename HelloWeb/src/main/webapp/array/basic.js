// array/basic.js

// 배열 선언 : [], new Array()
let arr = [1, 2]
let newAry = [3, 4, 5, 6]

// 추가: push : 마지막 위치로 unshift : 첫 번째 위치로
arr.push(3)
arr.unshift(0)

// 제거: pop() : 마지막부터 제거 shift() : 앞에서부터 제거
arr.pop()
arr.shift()

// forEach
newAry.forEach(function (elem) {
  // arr.push(elem) //뒤로 추가
  arr.unshift(elem) //앞으로 추가 6, 5, 4, 3, 1, 2
})

arr.pop() // 6, 5, 4, 3, 1
arr.pop() // 6, 5, 4, 3
arr.shift() // 5, 4, 3

// splice(위치, 크기, 대체값) : 추가, 수정, 삭제 대체값이 없으면 삭제
newAry.forEach(function (elem) {
  arr.splice(1, 1, elem)
})

let names = []
let anonym = 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia, deleniti cumque voluptate nemo aperiam nisi? Et vero sint aut ullam debitis voluptatem ipsam iure? Nesciunt inventore minus architecto harum. Recusandae?'
anonym.split(' ').forEach(function (elem) {
  names.push(elem)
})
console.log(names.toString())
console.log(names)

// forEach() : 반환 타입 없음
// map() : 각요소 => mapping 작업(다른 형태 반환)
// filter() : return 조건을 만족하는 값만 반환

let result = names.map(function (elem) { //새로운 형태의 배열
  return elem.toUpperCase()
})

result = result.filter(function (elem) {
  return elem.length >= 10
})

result = names.map(elem => elem.toUpperCase()).filter(elem => elem.length >= 10) // chain rules
console.log(result)