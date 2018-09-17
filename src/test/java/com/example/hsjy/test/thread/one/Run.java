package com.example.hsjy.test.thread.one;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		/*try {
			final SynchronizedObject object = new SynchronizedObject();

			Thread thread1 = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};

			thread1.setName("a");
			thread1.start();


			Thread.sleep(1000);

			Thread thread2 = new Thread() {
				@Override
				public void run() {
					System.out
							.println("thread2启动了，但是进入不了printString()");
					System.out
							.println("因为printString被a线程锁定了，且永远suspend了");
					object.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Thread thread = new Thread(() ->{
			long beginTime = System.currentTimeMillis();
			int count  = 0;
			for (int i = 0; i < 50000000; i++) {
				Thread.yield();
				count = count +(i+1);
			}

			long endTime = System.currentTimeMillis();
			System.out.println("用时"+(endTime-beginTime)+"毫秒"+count);
		});
		thread.start();
	}

}
