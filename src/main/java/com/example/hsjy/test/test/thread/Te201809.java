package com.example.hsjy.test.test.thread;


/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test.thread
 * @ClassName: Te201809
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/11 22:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/11 22:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Te201809 {
    public static void main(String[] args) {
        Myhthread  myhthread1 = new Myhthread();
        Thread t1 = new Thread(myhthread1,"A");
        Thread t2 = new Thread(myhthread1,"B");
        Thread t3 = new Thread(myhthread1,"C");
        Thread t4 = new Thread(myhthread1,"D");
        Thread t5 = new Thread(myhthread1,"E");
        t1.start();
        t2.start();
        t3.start();t4.start();t5.start();
    }
}
