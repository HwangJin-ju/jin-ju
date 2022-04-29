/**
 * ajax.js 
 */
 
 // ajax. 비동기방식
 
 let val = 10;
 
 setTimeout(function(){ // (실행할 함수, 이 시간의 텀을 두고. 단위는 밀리세컨드)
 	val += 5;
 	console.log('hello-> ' + val);
 	
 	setTimeout(function(){ 
  	val += 3;
 	console.log('hello2-> ' + val)
 		
 		 setTimeout(function(){ 
  		 val += 4;
 		 console.log('hello3-> ' + val)
 	     }, 1000); 
 	
 	}, 1000); 
 	
 }, 2000);
 
 let success = false
 let promise = new Promise(function(resolve, reject) { //(요청한 작업이 정상적으로 처리되면 실행할 함수, 에러나면 실행할 함수)
 
 	if(success) {
 		resolve('success');
 	} else {
 		reject('error')
 	}
 }); 
 
 promise.then(function(result){ // then()성공하면 실행할 메소드
 		   console.log(result)
 		 })
 		 .then(function(result){
 		 	console.log(result)
 		 })  
 		 .then(function(result){
 		 	console.log(result)
 		 })
 		.catch(function(error){ // catch()실패하면 실행할 메소드
 		   console.log(error)
 		 }) 
 
 
 
 