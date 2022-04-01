package com.edu.lambda;

interface Runnable2 {//매개변수는 있고 반환 타입은 없음 
	public void run(String animal);
}

public class RunExample2 {
	public static void main(String[] args) {
		Runnable2 runnable = (String animal) -> {
			System.out.println(animal + "가(이) 달립니다.");
		};
		
		runnable.run("호랑이");
	}

}
