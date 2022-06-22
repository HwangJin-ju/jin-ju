package co.micol.prj.board.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class boardVO {
	private int boardId;
	private String boardName;
	private String boardTitle;
	private String boardContents;
		
	private Date boardDate;
	private int boardHit;

}
