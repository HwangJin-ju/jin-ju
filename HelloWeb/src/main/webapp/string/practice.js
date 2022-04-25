// string/practice.js

	let str1 = 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia, deleniti cumque voluptate nemo aperiam nisi? Et vero sint aut ullam debitis voluptatem ipsam iure? Nesciunt inventore minus architecto harum. Recusandae?'

  // 단어의 길이가 10개 이상인 값을 골라내서 
  // 콤마로 구분

  
  // result = str1.split(' ').filter(function(val){if (val.length>= 10) return val }).join(',')
  result = str1.split(' ').filter(val => val.length >= 10).join(',')

  console.log(result)

  
  