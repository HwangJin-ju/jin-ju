// object/practice2.js
// 달력만들기

let year = 2022
let month = 4


function showCalander(year, month){
let firstDay = getFirstDay(year, month) // 1일의 위치 지정하기 위한 함수
let lastDate = getLastDate(year, month) // 해당월의 마지막 날을 계산하기 위한 함수

document.write('<table border=1><tr>')
// 빈공간 작성
// document.write(showDayInfo())
showDayInfo()
for (let i =0; i<firstDay; i++) {
  document.write('<td> </td>')
}
//날짜 화면 출력
for (let i = 1; i <= lastDate; i++) {
  // document.write(`<td>${i}</td>`)
  if((i+ firstDay)%7==0) { //토요일은 파란색
    document.write(`<td style="background-color:lightblue">${i}</td>`)  
    document.write('<tr></tr>')
  } else if((i+firstDay)%7==1) { //일요일은 분홍색
    document.write(`<td style="background-color:lightpink">${i}</td>`)  
  } else {
    document.write(`<td>${i}</td>`)
  }
}
document.write('</tr></table>')
}


showCalander(2022, 5)

function showDayInfo(){
  let day = ['일','월', '화', '수', '목', '금', '토']
  document.write('<tr style="background-color: lightgray">')
  day.forEach(function(day) {
    result = `<th>${day}</th>`
    document.write(result)
  })  
  document.write('</tr>')

}



function getLastDate(year, month) {
  switch (month) {
    case 1:
      return 31
    case 2:
      return 28  
    case 4:
      return 30
    case 5:
      return 31
    case 6:
      return 30
    case 7:
      return 31
    case 8:
      return 31
    case 9:
      return 30
    case 10:
      return 31
    case 11:
      return 30
    case 12:
      return 31                 
       
  }
}

function getFirstDay(year, month) {
  switch (month) {
    case 1:
      return 6
    case 2:
      return 2
    case 3:
      return 2
    case 4:
      return 5
    case 5:  
      return 0
    case 6:
      return 3
    case 7: 
      return 5
    case 8:
      return 1
    case 9:
      return 4
    case 10:
      return 6
    case 11:
      return 2
    case 12:
      return 4      
  }
}