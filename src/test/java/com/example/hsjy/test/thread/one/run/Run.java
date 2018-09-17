package com.example.hsjy.test.thread.one.run;

import com.example.hsjy.test.thread.one.SynchronizedObject;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.thread.one
 * @ClassName: Run
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/12 21:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/12 21:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
/*        HasSelfPrivateNum h = new HasSelfPrivateNum();
        HasSelfPrivateNum hh = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(h);
        threadA.start();

        ThreadB threadB = new ThreadB(hh);
        threadB.start();*/


        MyThread t = new MyThread();
        t.start();


/*        Thread.currentThread().interrupt();
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println("end");*/

/*
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        Thread.sleep(200);
*/

     /*   //myThread.interrupt();
        Thread thread1 = Thread.currentThread();
        Thread thread = new Thread(() ->{
            for (int i =1 ; i < 100 ; i++){
*//*                if (i == 3){
                    try {
                        thread1.join();
                    } catch ( InterruptedException e ) {
                        e.printStackTrace();
                    }
                }*//*
                if (i %3 == 0){
                    Thread.yield();
                    System.out.println("考试礼让了");
                }
                try {
                    Thread.sleep(2000);
                } catch ( InterruptedException e ) {
                    e.printStackTrace();
                }
                System.out.println( Thread.currentThread().getName()+"qqqqqqqqqqqqqqqqqqqq");
            }
        });
        thread.start();

        for (int x = 1 ; x< 100 ; x++){
            Thread.sleep(3000);
            System.out.println("霸道总裁");
        }
*/
/*


        //myThread.interrupt();
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"+myThread.isAlive());
        hj(myThread);
        System.out.println(myThread.interrupted())   */ ;
    }
    public static void  hj(MyThread myThread){
        System.out.println("1111111111111111111111111111"+myThread.isAlive()+myThread.getClass().getSimpleName());
    }
}
