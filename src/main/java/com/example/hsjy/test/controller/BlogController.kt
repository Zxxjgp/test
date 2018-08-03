package com.example.hsjy.test.controller

import com.example.hsjy.test.entity.Person
import com.example.hsjy.test.service.BlogService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sun.security.provider.certpath.OCSPResponse
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
}