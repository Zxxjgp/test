package com.example.hsjy.test.controller

import com.example.hsjy.test.entity.BlogArticle
import com.example.hsjy.test.service.BlogArticleService
import com.example.hsjy.test.utils.Identities
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*
import javax.annotation.Resource

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.controller
 * @ClassName:      BlogArticleController
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/7 14:56
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/7 14:56
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Controller
@RequestMapping(value = "/a/article")
class BlogArticleController {
    @Resource
    private lateinit var blogArticleService: BlogArticleService

    @RequestMapping("list")
    fun getArticle() : List<BlogArticle> = blogArticleService.articleList()

    @RequestMapping("save")
    @ResponseBody
    fun saveArticle(blogArticle: BlogArticle) :Int {
        blogArticle.id = Identities.uuid2()
        blogArticle.title = "工作中会遇到工作流引擎的"
        blogArticle.content = "创建测试类com.gx.SpringData测试配置文件spring-data-beans.xml里面配置的EntityManagerFactory是否成功"
        blogArticle.createBy = "jgp"
        return blogArticleService.save(blogArticle)
    }
    /**
     * 页面的额跳转
     */
    @RequestMapping("pagejump")
    fun pagejump(model:Model): String{
        var dateFormat = SimpleDateFormat("yyyy-mm-dd ")
        var date = Date()
        dateFormat.format(date)
        model.addAttribute("da",date)
        model.addAttribute("key",blogArticleService.articleList())
        val blogArticle = BlogArticle()
        blogArticle.id = Identities.uuid2()
        blogArticle.title = "工作中会遇到工作流引擎的"
        blogArticle.content = "创建测试类com.gx.SpringData测试配置文件spring-data-beans.xml里面配置的EntityManagerFactory是否成功"
        blogArticle.createBy = "jgp"
        model.addAttribute("kl",blogArticle)
        return "index"
    }

}