package com.example.hsjy.test.service.impl

import com.example.hsjy.test.dao.BlogArticleDao
import com.example.hsjy.test.dao.BlogUserDao
import com.example.hsjy.test.entity.BlogUser
import com.example.hsjy.test.service.BlogUserService
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.service.impl
 * @ClassName:      BlogUserSErviceImpl
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/14 21:47
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/14 21:47
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Service
class BlogUserSErviceImpl : BlogUserService {
    @Resource
    private lateinit var blogUserDao: BlogUserDao
    override fun getBlogUserInfo(id: String): BlogUser = blogUserDao.getBlogUserInfo(id)
}