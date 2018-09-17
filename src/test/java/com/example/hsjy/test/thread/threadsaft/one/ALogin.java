package com.example.hsjy.test.thread.threadsaft.one;


public class ALogin extends Thread {
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
