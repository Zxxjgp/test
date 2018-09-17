package com.example.hsjy.test.thread.threadsaft.one;

public class MyThread extends Thread {

	public MyThread() {
		System.out.println("构造方法中的状态：" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("run方法中的状态：" + Thread.currentThread().getName());
	}

}