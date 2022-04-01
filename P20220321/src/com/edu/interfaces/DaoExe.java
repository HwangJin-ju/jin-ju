package com.edu.interfaces;

public class DaoExe {
	public static void main(String[] args) {
		Dao dao = new MySqlDao(); //new OracleDao(); //Dao:인터페이스 dao:구현객체 //담기는 인스턴스만 Oracle -> MySQL 기능은 그대로
		
		dao.select();
		
		dao.insert();
		
		dao.update();
		
		dao.delete();
		
		
	}
}
