package com.example.hsjy.test.service

import com.example.hsjy.test.entity.BlogArticle

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.service
 * @ClassName:      BlogArticleService
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/7 14:57
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/7 14:57
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
interface BlogArticleService {
    fun articleList() : List<BlogArticle>
    fun save(blogArticle: BlogArticle) : Int
}