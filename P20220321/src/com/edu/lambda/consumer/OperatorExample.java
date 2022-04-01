package com.edu.lambda.consumer;

import java.util.function.IntBinaryOperator;

//Operator : 연산처리 결과를 돌려줌
public class OperatorExample {
	public static void main(String[] args) {
		
		IntBinaryOperator intBin = (left, right) -> left + right ;
		intBin.applyAsInt(10, 20);
		
		intBin = (num1, num2) -> num1<num2? num1:num2; //intBin 변수가 가지는 기능이 바귐
		int result = maxOrMin(intBin);
		System.out.println(result);
	}
	                   //이 메소드는 지금까지의 매개값과는 달리 기능을 매개값으로 받음
	public static int maxOrMin(IntBinaryOperator intBin) { //값은 정해져있고 여기에 어떤 기능이 들어오느냐에 따라 달라짐
		int[] intAry = { 85, 47, 92 };
		int result = intAry[0];
		for(int num : intAry) { //배열에 든 개수만큼 반복문을 실행
			result = intBin.applyAsInt(result, num);
		}
		return result;
	}
}
