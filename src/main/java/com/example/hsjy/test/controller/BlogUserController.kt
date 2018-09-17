package com.example.hsjy.test.controller

import com.example.hsjy.test.entity.BlogUser
import com.example.hsjy.test.service.BlogUserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.controller
 * @ClassName:      BlogUserController
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/14 21:50
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/14 21:50
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@RestController
@RequestMapping(value = "/a/blog")
class BlogUserController {
    @Resource

    private lateinit var blogUserService: BlogUserService

    @RequestMapping(value = "userInfo")
    fun getBlogUserInfo(id:String) : BlogUser = blogUserService.getBlogUserInfo(id)
}