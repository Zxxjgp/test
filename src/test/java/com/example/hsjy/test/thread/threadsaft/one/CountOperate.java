package com.example.hsjy.test.thread.threadsaft.one;

public class CountOperate {

	public CountOperate() {
		System.out.println("CountOperate---begin");

		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getClass().getName());
		System.out.println("this.isAlive()=" + this.getClass().getConstructors());

		System.out.println("CountOperate---end");
	}

/*
	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("............................................"+this.getName());
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		System.out.println("run---end");
	}
*/

}
