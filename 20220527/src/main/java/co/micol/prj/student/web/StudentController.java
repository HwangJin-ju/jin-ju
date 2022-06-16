package co.micol.prj.student.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.prj.student.service.StudentService;
import co.micol.prj.student.vo.StudentVO;

@Controller // 나는 컨트롤러예용
public class StudentController {
	@Autowired
	StudentService studentDao; // DAO 객체를 자동 주입 (StudentServiceImpl 참고)
	
	@RequestMapping("/studentList.do") 
	public String studentList(Model model) { // model객체는 request에 담아주는 것과 비슷하다고 보면 됨 어떤 결과나 메시지를 page에 돌려주려고 할 때 사용하는 객체
		model.addAttribute("students", studentDao.studentSelectList()); // "students" : jsp페이지에서 사용할 객체명 studentDao.~가 값 (result set으로 담김)
		return "student/studentList"; // studentList가 보여줄 jsp 이걸 view resolver가 앞뒤로 주소를 부텽줌
	}
	
	@RequestMapping("/studentSelect.do") // 한 명 데이터 조회
	public String studentSelect(StudentVO vo, Model model) { //StudentVO가 가진 객체를 받아서 model에 태워서 보내면 됨
		model.addAttribute("student", studentDao.studentSelect(vo));
		return "student/studentSelect";
	}

}
