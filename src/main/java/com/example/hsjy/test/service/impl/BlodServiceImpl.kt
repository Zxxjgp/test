package com.example.hsjy.test.service.impl

import com.example.hsjy.test.dao.BlogDao
import com.example.hsjy.test.entity.Person
import com.example.hsjy.test.service.BlogService
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.service.impl
 * @ClassName:      BlodServiceImpl
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/8/2 15:36
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/8/2 15:36
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Service
class BlodServiceImpl: BlogService {
    @Resource
    private lateinit var blogDao: BlogDao

    override fun finAll(): List<Person> = blogDao.finAll()
}