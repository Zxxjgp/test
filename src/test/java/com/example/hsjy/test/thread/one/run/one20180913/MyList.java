package com.example.hsjy.test.thread.one.run.one20180913;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();

	synchronized public void add(String username) {
		System.out.println("ThreadName=" + Thread.currentThread().getName()+this.getClass().getSimpleName()
				);
		list.add(username);
		System.out.println("ThreadName=" + Thread.currentThread().getName()+this.getClass().getSimpleName()
				);
	}

	synchronized public int getSize() {
		System.out.println("ThreadName=" + Thread.currentThread().getName()+"SSSSSSSSSSSSSSSS"
		);
		int sizeValue = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName()+"WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"
				);
		return sizeValue;
	}

}
