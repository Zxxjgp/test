package com.example.hsjy.test.hsjycrm.entity;

import com.example.hsjy.test.hsjycrm.entity.CrmPerson;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.hsjycrm.dao
 * @ClassName: TestDap
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/17 22:16
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/17 22:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestDap {
    public static void main(String[] args) {
        CrmPerson crmPerson =new CrmPerson(LocalDateTime.now());

    }
}
