package com.example.hsjy.test.service

import com.example.hsjy.test.entity.Person

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.service
 * @ClassName:      BlogService
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/8/2 15:31
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/8/2 15:31
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
interface BlogService {
    fun finAll() : List<Person>
}