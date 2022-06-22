package co.micol.prj.board.service;

import java.util.List;

import co.micol.prj.board.vo.boardVO;

public interface boardService {
	List<boardVO> boardList(int state, String key);
	boardVO boardSelect(boardVO vo);
	int boardInsert(boardVO vo);
	int boardUpdate(boardVO vo);
	int boardDelete(boardVO vo);
	
	int boardHitUpdate(int id);

}
