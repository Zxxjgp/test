package com.example.hsjy.test.thread.one.run.one20180913;



public class Run {

	public static void main(String[] args) throws InterruptedException {
/*
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
        thread1.setName("A");
		thread1.start();

		MyThread2 thread2 = new MyThread2(task);
		thread2.setName("B");
		thread2.start();
*/

        MyList myList = new MyList();

        MyThreadA thread1 = new MyThreadA(myList);
        thread1.setName("A");
        thread1.start();

        MyThreadB thread2 = new MyThreadB(myList);
        thread2.setName("B");
        thread2.start();
	}
}
