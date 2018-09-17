package com.example.hsjy.test.thread.one.run;


import java.util.Scanner;

public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

	public static void main(String[] args) {
		int F = 0;
		int C = 0;
		//上面两个表示初始化

		System.out.println("请输入您的摄氏温度！");
		Scanner scanner = new Scanner(System.in);
		C = scanner.nextInt();
		F = (int)(9/5)*C+32;
		System.out.println("您的得到的华氏温度是"+F);
	}

}
