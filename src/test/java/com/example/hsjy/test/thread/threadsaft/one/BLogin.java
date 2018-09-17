package com.example.hsjy.test.thread.threadsaft.one;


public class BLogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
