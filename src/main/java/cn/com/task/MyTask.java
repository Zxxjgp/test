package cn.com.task;

import java.util.TimerTask;

/**
 * @ProjectName: test
 * @Package: cn.com.task
 * @ClassName: MyTask
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/20 17:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/20 17:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("【当前线程执行的"+Thread.currentThread().getName()+"时间是"+System.currentTimeMillis());
    }
}
