package com.edu.api;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name =name;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id) && this.name == member.name) { // = if (this.id == member.id)
				return true;
			}
		}
		return false;
	}


	@Override
	public int hashCode() {
		return 1111;
	}
	
	

}
