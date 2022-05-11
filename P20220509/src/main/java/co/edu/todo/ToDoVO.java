package co.edu.todo;

public class ToDoVO {
	private String toDo;
	private String status;
	public String getToDo() {
		return toDo;
	}
	public void setToDo(String toDo) {
		this.toDo = toDo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ToDoVO [toDo=" + toDo + ", status=" + status + "]";
	}
	public ToDoVO(String toDo, String status) {
		super();
		this.toDo = toDo;
		this.status = status;
	}
	

	public ToDoVO() {
		
	}

	
}


