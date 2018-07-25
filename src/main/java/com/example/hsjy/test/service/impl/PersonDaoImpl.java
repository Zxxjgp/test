package com.example.hsjy.test.service.impl;

import com.example.hsjy.test.dao.PersonDao;
import com.example.hsjy.test.entity.Person;
import com.example.hsjy.test.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.service
 * @ClassName: PersonDaoImpl
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/25 13:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/25 13:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class PersonDaoImpl implements PersonService {
    @Resource
    private PersonDao personDao;
    @Override
    public List<Person> selectAllUser() {
        return personDao.selectAllUser();
    }
}
