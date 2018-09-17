package com.example.hsjy.test.service

import com.example.hsjy.test.entity.BlogUser

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.service
 * @ClassName:      BlogUserService
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/14 21:47
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/14 21:47
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
interface BlogUserService {
    fun getBlogUserInfo(id: String) : BlogUser
}