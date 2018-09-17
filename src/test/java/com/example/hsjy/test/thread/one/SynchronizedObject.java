package com.example.hsjy.test.thread.one;

public class SynchronizedObject {

	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程永远的 suspend锁定了");
			Thread.currentThread().suspend();
			Thread.currentThread().resume();
		}

		System.out.println("end");
	}

}
