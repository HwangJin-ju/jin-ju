// dom/practice2.js

document.addEventListener('DOMContentLoaded', function () {
	let divTag = document.createElement('div')

	let spanName = document.createElement('span')
	spanName.setAttribute('id', 'name')
	console.log(spanName)
	let name = document.createTextNode('홍길동')
	spanName.appendChild(name) // <span>홍길동</span>

	let spanAge = document.createElement('span')
	spanAge.setAttribute('class', 'age') //attribute노트 추가
	let age = document.createTextNode('20살')
	spanAge.appendChild(age)

	let hypen = document.createTextNode(' - ')

	divTag.appendChild(spanName)
	divTag.appendChild(hypen)
	divTag.appendChild(spanAge)

	let divShow = document.getElementById('show').appendChild(divTag)
})