package com.example.hsjy.test.test.thread;

import kotlin.jvm.Synchronized;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test.thread
 * @ClassName: Myhthread
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/12 16:00
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/12 16:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Myhthread extends Thread {
    private int count = 9;

    @Override
    synchronized 
    public  void run() {
        super.run();
        count--;
        System.out.println("由+"+currentThread().getName()+"计算"+count);
    }
}
