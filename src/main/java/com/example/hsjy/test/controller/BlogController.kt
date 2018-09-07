package com.example.hsjy.test.controller

import com.example.hsjy.test.entity.Person
import com.example.hsjy.test.entity.Stu
import com.example.hsjy.test.entity.TestStu
import com.example.hsjy.test.service.BlogService
import com.example.hsjy.test.utils.HttpUtils
import com.example.hsjy.test.utils.Post
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.controller
 * @ClassName:      BlogController
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/8/2 15:43
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/8/2 15:43
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@RestController
@RequestMapping("/blog")
class BlogController {

    @Resource
    private lateinit var blogService: BlogService

    @RequestMapping("list")
    fun findList() :List<Person> = blogService.finAll()
    @RequestMapping("kotlib")
    fun findKotlin() : Stu {
        var g = Stu()
        g.code = "789456"
        g.g = "你的生活GG了"

        val h = TestStu()
        h.age = "25"
        h.name = "焦关平"
        val copy = h.copy()
        println(copy.age+h.name )

        val doGet = HttpUtils.doGet("https://blog.csdn.net/chinoukin/article/details/78259646")
        var k =HttpUtils.doPost("https://www.baidu.com","nihao")
        println(k)
        return g
    }

}
