package com.example.hsjy.test.test20180919;

import lombok.Data;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test20180919
 * @ClassName: Membet
 * @Description: java类作用描述:对象的克隆操作
 * @Author: 焦关平
 * @CreateDate: 2018/9/19 15:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/19 15:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class Membet implements Cloneable {
    private String name;
    private int age;

    public Membet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "【"+super.toString()+"】"+"name="+this.name+"age="+this.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-MM-d H-m-ss-S");
        String format = simpleDateFormat.format(d);
        System.out.println(format);

    }
}


