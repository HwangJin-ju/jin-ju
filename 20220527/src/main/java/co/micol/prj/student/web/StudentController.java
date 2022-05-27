package co.micol.prj.student.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.prj.student.service.StudentService;

@Controller // 나는 컨트롤러예용
public class StudentController {
	@Autowired
	StudentService studentDao; // DAO 객체를 자동 주입 (StudentServiceImpl 참고)
	
	@RequestMapping("/studentList.do")
	public String studentList(Model model) {
		model.addAttribute("students", studentDao.studentSelectList());
		return "student/studentList";
	}

}
