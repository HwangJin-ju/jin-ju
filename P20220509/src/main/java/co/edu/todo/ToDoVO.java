package co.edu.todo;

public class ToDoVO {
	private String toDo;
	private String checked;

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}
	
	public ToDoVO() {
		
	}

	public ToDoVO(String toDo, String checked) {
		super();
		this.toDo = toDo;
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "ToDoVO [toDo=" + toDo + ", checked=" + checked + "]";
	}

}


