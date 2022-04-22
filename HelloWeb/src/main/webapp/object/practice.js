//object/practice.js

const jsonObj =
  `
[{"id":1,"first_name":"Elvin","last_name":"Fearon","email":"efearon0@topsy.com","gender":"Male","ip_address":"101.93.229.177"},
{"id":2,"first_name":"Rozelle","last_name":"Raddin","email":"rraddin1@qq.com","gender":"Female","ip_address":"15.35.72.119"},
{"id":3,"first_name":"Robers","last_name":"Pudge","email":"rpudge2@umn.edu","gender":"Male","ip_address":"60.34.222.7"},
{"id":4,"first_name":"Mareah","last_name":"Hynam","email":"mhynam3@latimes.com","gender":"Female","ip_address":"227.168.138.186"},
{"id":5,"first_name":"Brett","last_name":"Keech","email":"bkeech4@opera.com","gender":"Female","ip_address":"167.192.5.192"},
{"id":6,"first_name":"Dasi","last_name":"Kesby","email":"dkesby5@unc.edu","gender":"Female","ip_address":"31.89.232.39"},
{"id":7,"first_name":"Sophey","last_name":"Frostdick","email":"sfrostdick6@ask.com","gender":"Female","ip_address":"95.81.141.86"},
{"id":8,"first_name":"Ynes","last_name":"Ingman","email":"yingman7@ibm.com","gender":"Female","ip_address":"131.94.124.179"},
{"id":9,"first_name":"Dre","last_name":"Elcombe","email":"delcombe8@amazon.com","gender":"Female","ip_address":"175.22.127.16"},
{"id":10,"first_name":"Gabbie","last_name":"Rignold","email":"grignold9@google.fr","gender":"Male","ip_address":"88.194.50.207"},
{"id":11,"first_name":"Barrie","last_name":"Lashbrook","email":"blashbrooka@imdb.com","gender":"Male","ip_address":"221.6.11.110"},
{"id":12,"first_name":"Lyon","last_name":"Burbank","email":"lburbankb@foxnews.com","gender":"Male","ip_address":"224.82.105.215"},
{"id":13,"first_name":"Bay","last_name":"Crutchley","email":"bcrutchleyc@spotify.com","gender":"Male","ip_address":"171.253.83.99"},
{"id":14,"first_name":"Sharline","last_name":"Faircley","email":"sfaircleyd@wunderground.com","gender":"Female","ip_address":"124.116.222.99"},
{"id":15,"first_name":"Jocelyne","last_name":"Carnelley","email":"jcarnelleye@edublogs.org","gender":"Non-binary","ip_address":"66.41.16.235"}]
`
// json 문자열 => javascript 오브젝트로 변경
const objAry = JSON.parse(jsonObj)
console.log(objAry) // id:?, first_name:?, last_name:?

let fields = ['id', 'first_name', 'last_name', 'email']

function showTable(ary) { // ary 매개변수를 지칭하는 단어 objAry랑 상관없음 
  let tableTag = ""
  // <table>
  // <thead><tr><th></th>*항목 개수</tr></thead>
  // <tbody><tr><td></td>*항목개수</td></tr>*건수</tbody>        
  // </table>

  tableTag += '<table>'
  tableTag += createHead()
  tableTag += createBody(ary)
  tableTag += '</table>'

  document.write(tableTag)
}

function createHead() {
  // <thead><tr><th></th>*항목 개수</tr></thead>
  let headTag = ""
  headTag += '<thead><tr>'
  fields.forEach(function (val) {
    headTag += `<th>${val}</th>`
  })
  headTag += '</thead></tr>'
  console.log(headTag)
  return headTag //여기서 리턴된 값을 tableTag에 누적시킴

}

function createBody(ary) {
  // <tbody><tr><td></td>*항목개수</td></tr>*건수</tbody>        
  let bodyTag = ""
  bodyTag += '<tbody>'
  ary.forEach(function (val, idx) { // 첫번째 데이터, 두번째 데이터 ..
    bodyTag += '<tr>'
    fields.forEach(function (field) { //id, first_name ..
      bodyTag += `<td>${val[field]}</td>`
    })
    bodyTag += '</tr>'
  })
  bodyTag += '</tbody>'
  console.log(bodyTag)
  return bodyTag
}

showTable(objAry)