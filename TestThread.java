package com.two;

class TimeThread extends Thread{
	int n=0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		TimeThread th=new TimeThread();
		th.start(); //Thread 시작 명령
		try {
			th.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.stop();
	}
}
