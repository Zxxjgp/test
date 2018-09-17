package com.example.hsjy.test.thread.one.run.one20180913;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.thread.one.run.one20180913
 * @ClassName: Thread1
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/13 21:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/13 21:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Thread1 extends Thread {
    private ThreadService threadService;
    public Thread1(ThreadService threadService){
        super();
        this.threadService = threadService;
    }

    @Override
    public void run() {
        super.run();
        threadService.get();
    }
}
