let table, thead, tbody, tr, th, td, text 

// 테이블 만들기
table = document.createElement('table') // <table></table>

// thead 만들기
thead = document.createElement('thead') // <thead></thead>

  // 이름
tr = document.createElement('tr') // <tr></tr>
th = document.createElement('th') // <th></th>
text = document.createTextNode('이름')

th.appendChild(text) // <th>'이름'</th>
tr.appendChild(th) // <tr><th>'이름'</th></tr>

// 나이
th = document.createElement('th') // <th></th>
text = document.createTextNode('나이') 
th.appendChild(text) // <th>'나이'</th>
tr.appendChild(th) // <tr><th>'이름'</th><th>'나이'</th></tr>

thead.appendChild(tr) // <thead><tr><th>'이름'</th><th>'나이'</th></tr></thead>
table.appendChild(thead) // <table><thead><tr><th>'이름'</th><th>'나이'</th></tr></thead></table>

// tbody 만들기
tbody = document.createElement('tbody') // <tbody></tbody>
table.appendChild(tbody)
tr.setAttribute('id', "101")
tbody.appendChild(tr)
td = document.createElement('td')
text = document.createTextNode('홍길동')
th.appendChild(text)

console.log(table)

