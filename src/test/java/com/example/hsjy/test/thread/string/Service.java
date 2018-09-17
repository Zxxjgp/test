package com.example.hsjy.test.thread.string;

public class Service {
	public static void print(Object stringParam) {
		try {
			synchronized (stringParam) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
