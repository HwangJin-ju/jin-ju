package co.micol.prj.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.micol.prj.board.service.boardMapper;
import co.micol.prj.board.service.boardService;
import co.micol.prj.board.vo.boardVO;

@Repository("boardDao")
public class boardServiceImpl implements boardService {
	
	@Autowired
	private boardMapper map;
	
	@Override
	public List<boardVO> boardList(int state, String key) {
		return map.boardList(state, key);
	}

	@Override
	public boardVO boardSelect(boardVO vo) {
		return map.boardSelect(vo);
	}

	@Override
	public int boardInsert(boardVO vo) {
		return map.boardInsert(vo);
	}

	@Override
	public int boardUpdate(boardVO vo) {
		return map.boardUpdate(vo);
	}

	@Override
	public int boardDelete(boardVO vo) {
		return map.boardDelete(vo);
	}

	@Override
	public int boardHitUpdate(int id) {
		return map.boardHitUpdate(id);
	}



}
