package co.micol.prj.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.prj.board.service.boardService;
import co.micol.prj.board.vo.boardVO;

@Controller
public class boardController {

	@Autowired
	private boardService boardDao;

	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		model.addAttribute("boards", boardDao.boardList(1, "전체"));
		return "board/boardList";
	}

	@RequestMapping("/boardInsertForm.do")
	public String boardInsertForm() {
		return "board/boardInsertForm";
	}

	@PostMapping("/boardInsert.do")
	public String boardInsert(boardVO vo) {
		boardDao.boardInsert(vo);
		return "redirect:boardList.do";
	}

	@PostMapping("/boardContent.do")
	public String boardContent(boardVO vo, Model model) {
		boardDao.boardHitUpdate(vo.getBoardId());
		model.addAttribute("content", boardDao.boardSelect(vo));
		return "board/boardContent";

	}

	@RequestMapping("/boardDelete.do")
	public String boardDelete(boardVO vo) {
		boardDao.boardDelete(vo);
		return "redirect:boardList.do";
	}

	@RequestMapping("/boardModifyForm.do")
	public String boardModify(boardVO vo, Model model) {
		model.addAttribute("board", boardDao.boardSelect(vo));
		return "board/boardModifyForm";
	}

	@PostMapping("/boardModify.do")
	public String boardUpdate(boardVO vo) {
		
		boardDao.boardUpdate(vo);
		return "redirect:boardList.do";
	}

	@PostMapping("/ajaxSearch.do")
	@ResponseBody
	public List<boardVO> ajaxSearch(@RequestParam("state") int state, @RequestParam("key") String key){
		return boardDao.boardList(state, key);
	}
}
