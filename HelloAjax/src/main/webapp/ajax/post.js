/**
 * post.js 
 */

document.addEventListener('DOMContentLoaded', init)

// 전체리스트
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json') // ajax보다 상위에 있으므로 .. 해 줘야 함
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText); // parse 에러가 나면 studentList 만든 곳으로 가야 함
		console.log(data)
		let tbodyList = document.getElementById('list')
		data.forEach(function(elem) { // element에 대해 알고 싶을 때도 studentList로
			tbodyList.appendChild(makeTr(elem));
		})
	} // end of onload
	
	//  변경
	let modBtn = document.querySelector('input[type=button]'); // input태그인데 타입이 버튼
	modBtn.addEventListener('click', function() {
		let no = document.querySelector('input[name=sno]').value // input태그인데 네임이 sno (id가 없으니까 중복 없는 값인 네임으로 가져옴)
		let name = document.querySelector('input[name=sname]').value
		let eScore = document.querySelector('input[name=eScore]').value
		let kScore = document.querySelector('input[name=kScore]').value

		let xhtp = new XMLHttpRequest();
		xhtp.open('get', `modStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`); 
		xhtp.send();		
		xhtp.onload = function() {
			console.log(xhtp.responseText)
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				alert(result.studentNo + '번이 변경되었습니다.');
				
				// 결과값으로 받은 값으로 새로운 tr을 만들어줌 이걸 기존에 있던 값을 대체해 줄 예정
				let obj = {
					studentNo: result.studentNo,
					studentName: result.studentName,
					engScore: result.engScore,
					korScore: result.korScore
				}
				let newTr = makeTr(obj)
				let oldTr = document.getElementById(result.studentNo);
				document.getElementById('list').replaceChild(newTr, oldTr) // 부모요소(여기서는 tbody).replace(이걸로(newTr), 이거를(oldTr)) 대체
			} else {
				alert('변경 중 오류')
			}
		}
	})
} // end of init()

// 변경 처리
function modStudent() {

}

// 한 건 추가
function addStudent(e) {
	e.preventDefault(); // submit(전송기능) 차단 
	console.log(e);

	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;

	let xhtp = new XMLHttpRequest(); // 비동기방식으로 서버의 파일 요청
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`); // get 방식으로 ''에 있는 페이지요청
	xhtp.send();
	xhtp.onload = function() {//onload:처리된 결과를 받아오고 나면
		console.log(xhtp.responseText); // {"retCode":"Success"} 가 콘솔에 찍힘 (json 타입 문자열)
		let result = JSON.parse(xhtp.responseText); // parse를 통해 json 타입 문자열이 자바스크립트에서 쓰는 오브젝트 타입 {retCode:"Success"} 이 됨
		if (result.retCode == 'Success') {
			// 리스트에 새로운 값 추가
			successCallBack2(result); // {retCod:?, studNo:?, studName:?, eScore:?, kScore:?} 이라는 result가 반환되어 매개값으로 넘김
		} else if (result.retCode == 'Fail') {
			// 처리 중 에러 발생 메시지 띄우기
			failCallBack();
		}
	} // end of function 
}// end of addStudent(e)

function makeTr(student) {

	let tr = document.createElement('tr') // <tr></tr>
	tr.setAttribute('id', student.studentNo); // getElementById(id)로 해당 tr을 찾아와서 remove(); 하려고 id를 부여 studentNo=> studentList에 있는 값

	for (let field in student) {
		let td = document.createElement('td') // <td></td>
		td.innerHTML = student[field] // <td>student.studentNo</td> <td>student.studentName</td>
		tr.appendChild(td);
	}

	// 삭제 버튼 생성
	let delBtn = document.createElement('button')
	delBtn.innerHTML = '삭제'

	// 삭제 이벤트 등록
	delBtn.addEventListener('click', function() {
		// 삭제 기준은 id -> id 먼저 파악 후 ajax호출 (http)
		let id = this.parentElement.parentElement.firstChild.innerHTML; // this => 이벤트의 대상이 되는 element 여기서는 클릭하는 버튼
		console.log(id)
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id)
		xhtp.send() // 얘가 있어야 호출 실행이 됨
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				console.log(result.retVal)
				alert(result.retVal + '번이 삭제되었습니다.');
				console.log(document.getElementById(result.retVal))
				document.getElementById(result.retVal).remove();
			} else {
				console.log(result.retVal)
			}
		}
	});

	let td = document.createElement('td')
	td.appendChild(delBtn)
	tr.appendChild(td)

	return tr;
} // end of makeTr(student)

function successCallBack2(retObj) {
	console.log(retObj)

	let obj = {
		studentNo: retObj.studentNo,
		studName: retObj.studName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}

	document.getElementById('list').appendChild(makeTr(obj))
}

function successCallBack() {
	//사용자가 입력한 값을 id='list'인 tbody의 하위에 추가  
	let obj = {}

	let no = document.querySelector('input[name="sno"]').value; // addFrm에서 input 태그인데 name이 sno인 애를 선택하고 그 값을 가져옴
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;


	obj.StudentNo = no;
	obj.StudentName = name;
	obj.EngScore = eng;
	obj.KorScore = kor


	let row = makeTr(obj); // 이 함수에 의해서 만들어진 한 건 row를

	document.getElementById('list').appendChild(row);	// 리스트에 추가
}

function failCallBack() {
	alert('처리 중 에러 발생')
}