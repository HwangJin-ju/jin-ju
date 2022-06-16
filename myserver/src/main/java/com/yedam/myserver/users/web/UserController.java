package com.yedam.myserver.users.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.myserver.users.mapper.UserMapper;
import com.yedam.myserver.users.vo.UserVO;

@CrossOrigin(origins = {"*"}, maxAge = 3600)
@RestController
public class UserController {

	@Autowired UserMapper mapper;
	//전체조회
	@GetMapping("/users") // 내가 처리할 자원을 명시
	public List<UserVO> userSelect() {
		return mapper.find();
	}
	//단건조회
	@GetMapping("/users/{id}")
	public UserVO userSelectList(@PathVariable String id, UserVO vo) {
		vo.setId(id); // 자동으로 vo에 안 들어오기 때문에 url에서 가져옴
		return mapper.findById(vo);
	}
	//등록 (query String -> post는 query String 과 json String 둘 다 가능)	
	@PostMapping("/users")
	public UserVO userInsert(UserVO vo) {
		 mapper.persist(vo);
		 return vo;
	}
	//수정 (모든 파라미터는 json string으로만-> @RequestBody가 필수)
	@PutMapping("/users")
	public UserVO userUpdate(@RequestBody UserVO vo) {
		 mapper.merge(vo);
		 return vo;
	}	
	//삭제
	@DeleteMapping("/users/{id}")
	public UserVO userDelete(@PathVariable String id, UserVO vo) {
		 vo.setId(id);
		 mapper.remove(vo);
		 return vo;
	}		
}
