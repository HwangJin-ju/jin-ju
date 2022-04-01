package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {

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

// process(지금까지는 main쓰레드를 통해 싱글쓰레드 작업을 함)
public class BeepPrintExample {
	public static void main(String[] args) {

		// 쓰레드 생성하는 방법
		// ㄴ Thread의 생성자의 매개값으로 Runnable 인터페이스를 구현한 객체를 넣어준다

		// Thread thread = new Thread(new BeepTask());
		// ㄴ Runnable 인터페이스를 구현한 BeepTask 클래스를 만들어서 그걸 매개값으로 주는 방법으로 쓰레드를 만듦

		Thread thread = new Thread(() -> {
			// ㄴ Runnable 인터페이스의 익명구현객체를 생성
			// ㄴ Thread 클래스의 생성자 매개값으로 생성

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		thread.start(); // 쓰레드 시작

		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of prog");

	}
}
