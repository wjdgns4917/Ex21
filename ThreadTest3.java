package com.two;

class TestThread3 extends Thread{
	String name;
	public TestThread3(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(name+":"+i);
		}
	}
}
public class ThreadTest3 {
	public static void main(String[] args) {
		TestThread3 t1=new TestThread3("AA");
		TestThread3 t2=new TestThread3("BB");
		
		t1.start();
		t2.start();
	}
}
