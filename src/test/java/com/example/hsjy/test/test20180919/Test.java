package com.example.hsjy.test.test20180919;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test20180919
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/19 16:02
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/19 16:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Membet membet = new Membet("找我哥",33);
        Membet clone = (Membet) membet.clone();

        System.out.println(membet);
        System.out.println(clone);
    }
}
