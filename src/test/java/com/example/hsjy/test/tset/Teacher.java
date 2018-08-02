package com.example.hsjy.test.tset;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.tset
 * @ClassName: Teacher
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/27 15:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/27 15:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Teacher {
    @Value("${1}")
    public String name;

    public String getName() {
        return name;
    }
}
