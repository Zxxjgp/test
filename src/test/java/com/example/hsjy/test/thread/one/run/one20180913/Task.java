package com.example.hsjy.test.thread.one.run.one20180913;

public class Task {


	 public void doLongTimeTask() {
            System.out.println("ThreadName=" + Thread.currentThread().getName()+this.getClass().getSimpleName()
            );
            //list.add(username);
            System.out.println("ThreadName=" + Thread.currentThread().getName()+this.getClass().getSimpleName()
            );
		}


}
