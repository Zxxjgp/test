package com.example.hsjy.test.service;

import com.example.hsjy.test.entity.Person;

import java.util.List;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.service
 * @ClassName: PersonService
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/25 13:48
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/25 13:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface PersonService {
    List<Person> selectAllUser();
}
