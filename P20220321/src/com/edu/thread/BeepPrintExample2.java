package com.edu.thread;

import java.awt.Toolkit;

class BeepThread extends Thread {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
}

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// 비프음을 생성하는 것 하나
		// beep 글자 출력하는 것 하나
		// 멀티 쓰레드로 만들기

		// Thread 클래스를 상속받는 클래스를 선언. run 메소드를 override해서 구현
		Thread thread = new BeepThread();
		thread.start();
	
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog");

	}
}
