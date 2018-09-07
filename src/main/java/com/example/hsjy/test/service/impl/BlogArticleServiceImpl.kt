package com.example.hsjy.test.service.impl

import com.example.hsjy.test.dao.BlogArticleDao
import com.example.hsjy.test.entity.BlogArticle
import com.example.hsjy.test.service.BlogArticleService
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.service.impl
 * @ClassName:      BlogArticleServiceImpl
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/7 14:58
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/7 14:58
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Service
class BlogArticleServiceImpl : BlogArticleService {
    @Resource
    private lateinit var blogArticleDao: BlogArticleDao
    override fun save(blogArticle: BlogArticle): Int = blogArticleDao.save(blogArticle)

    override fun articleList(): List<BlogArticle> = blogArticleDao.articleList()
}