package com.example.hsjy.test.thread.one.run;



public class Main {

	public int i = 10;

	synchronized public void operateIMainMethod() {
		try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {



	}

}
