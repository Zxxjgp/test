package com.example.hsjy.test.thread.threadsaft.one;


public class Run {

	public static void main(String[] args) {
	/*	ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();*/
/*
		MyThread myhthread = new MyThread();

		System.out.println(".............."+myhthread.isAlive());
		myhthread.start();
		//myhthread.run();
		System.out.println(".............."+myhthread.isAlive());*/


		MyThread1 myThread1= new MyThread1();

		myThread1.start();

/*
		System.out.println("..........."+myThread1.getId());
		System.out.println("1111111111111"+myThread1.isAlive());
		System.out.println("end"+System.currentTimeMillis());*/
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("1111111111111"+myThread1.isAlive());
	}

}
