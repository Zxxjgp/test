package com.example.hsjy.test.thread.one.run.one20180913;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.thread.one.run.one20180913
 * @ClassName: ThreadService
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/13 21:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/13 21:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ThreadService {
    public void get(){
        synchronized (this){
            System.out.println("第一次执行");
        }
        System.out.println("第一次执行的后续事情");
    }

    public  void geter(){

        synchronized (this){
            System.out.println("我是老二");
        }
        System.out.println("我是老二的测试版");
    }
}
