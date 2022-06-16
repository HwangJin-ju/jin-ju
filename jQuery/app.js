// 현재 스크립트 위치 : 헤드 -> 바디가 실행되고 난 다음에 변경해야 하므로 이벤트 추가 함
window.addEventListener("load", function () {
  console.log($("h1").text())
  $("h1").text("변경됨").css("color", "skyblue") 
  // 묵시적 반복 -> h1은 전부 바뀜 / text() : 모든 태그의 내용을 조회 val() : 첫번째 태그만 조회