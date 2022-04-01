package com.edu.interfaces;

public class MainExe {
	public static void main(String[] args) {
		// 리모콘 -> TV, Radio, 냉장고
		RemoteControl rm = new TV(); //다형성의 특징도 가짐
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Refrigerator();
		rm.powerOn();
		rm.powerOff();
		
	}
}
