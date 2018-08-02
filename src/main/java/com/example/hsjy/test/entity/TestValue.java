package com.example.hsjy.test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.entity
 * @ClassName: TestValue
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/27 16:19
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/27 16:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
public class TestValue {
    @Value("${spring.datasource.driver-class-name}")
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
