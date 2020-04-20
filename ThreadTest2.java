package com.two;

class TestThread2 extends Thread{
	private boolean stop;
	
	public TestThread2() {
		this.stop=false;
	}
	
	@Override
	public void run() {
		while (!stop) {
			System.out.println("무한실행");
		}
		System.out.println("실행종료");
	}
	public void threadStop(boolean stop) {
		this.stop=stop;
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		TestThread2 thread=new TestThread2();
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		thread.threadStop(true);
	}
}
