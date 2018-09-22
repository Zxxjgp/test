package com.example.hsjy.test.test20180919.math;

import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test20180919.math
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/19 16:15
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/19 16:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

        Locale locale= new Locale("zh","CN");
        Locale l = Locale.getDefault();

        Locale ll = Locale.CHINA;
        System.out.println(ll);
        System.out.println(locale);
        System.out.println(l);

    }
}
