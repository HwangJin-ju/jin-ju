package co.dev.vo;

public class MemberVO { //데이터베이스에 있는 필드들을 각각 가져와서 담음
	
	private String id;
	private String name;
	private String passwd;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", passwd=" + passwd + ", email=" + email + "]";
	}
	
	

}
