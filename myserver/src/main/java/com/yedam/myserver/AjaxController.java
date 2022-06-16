package com.yedam.myserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.myserver.emp.vo.Employee;

@RestController // responseBody 포함하고 있는거
public class AjaxController {
	@GetMapping("req")
	public String reqGet() {
		return "get";
	}
	
	@PostMapping("req")
	@ResponseBody // 자바객체를 json 형식의 스트링으로 변환
	//@RequestBody : json 형식의 스트링으로 넘어온 값을 파싱해서 VO 객체로 변환 -> 리스트로 한꺼번에 담는 게 가능해짐
	public String reqPost(@RequestBody Employee vo) throws InterruptedException {
		//Thread.sleep(3000);
		System.out.println(vo.getFirst_name());
		return "post";
	}
}
