package com.example.hsjy.test.test;

import com.example.hsjy.test.utils.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test
 * @ClassName: Hsjt
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/8/21 8:50
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/21 8:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Hsjt {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(ZoneId.systemDefault().getId());
        System.out.println(ZoneId.systemDefault().getRules());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(new Date());
        System.out.println(LocalDateTime.MAX);
        Post p = new Post();
        p.connectWeiXinInterface("wwww,baidu.com","我是你哥");
    }



}
