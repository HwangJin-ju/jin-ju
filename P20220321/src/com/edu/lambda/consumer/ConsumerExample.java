package com.edu.lambda.consumer;

import java.util.function.*; //function 패키지 아래에 있는 걸 다 import
import java.util.function.Consumer; //매개값 o 리턴값 x

public class ConsumerExample {
	public static void main(String[] args) {

		// functional interface 일 경우에만 람다 표현식으로 표현 가능
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "출력합니다.");
		}; //consumer 변수에 이 기능을 담았음
		
		consumer.accept("메세지를 ");
		
		BiConsumer<Integer, Integer> biCon = (t, u) -> {
				System.out.println("result => " + (t+u));
		};
		
		biCon.accept(20, 40);
	}
}
