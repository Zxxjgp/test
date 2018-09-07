package com.example.hsjy.test.dao

import com.example.hsjy.test.entity.BlogArticle
import org.apache.ibatis.annotations.Mapper

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.dao
 * @ClassName:      BlogArticleDao
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/7 14:54
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/7 14:54
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Mapper
interface BlogArticleDao {
    fun articleList() : List<BlogArticle>
    fun save(blogArticle: BlogArticle) : Int
}