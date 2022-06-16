package com.yedam.myserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.myserver.emp.vo.Employee;

public class LamdaTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(Employee.builder().email("a@a.c").salary(1000).build()); // 생성자 없이 객체를 생성하는 방법
		list.add(Employee.builder().email("z@a.c").salary(200).build());
		list.add(Employee.builder().email("c@a.c").salary(2000).build());
		list.add(Employee.builder().email("k@a.c").salary(500).build());

		Collections.sort(list, new Comparator<Employee>() { // 익명 클래스 : 클래스 선언과 생성을 한 번에
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary()-o2.getSalary();
			}} );
		// 자바 람다식 : 부모 인터페이스의 오버라이딩 해야 할 메소드가 1개인 경우만 가능 
		Collections.sort(list, (Employee o1, Employee o2) -> o1.getSalary()-o2.getSalary()  );
		
		for(Employee emp : list ) {
			System.out.println(emp.getEmail() + ":" + emp.getSalary());		
		}
	}

}


class EmpComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
