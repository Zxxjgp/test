package com.example.hsjy.test.entity

import lombok.Data
import java.io.Serializable
import java.time.LocalTime

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.entity
 * @ClassName:      BlogUser
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/14 21:35
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/14 21:35
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class BlogUser(
        var id : String ? = null,
        var loginName : String ? = null,
        var password : String ? = null,
        var disabled : Int ? = null,
        var name : String ? = null,
        var email : String ? = null,
        var phone : String ? = null,
        var mobile : String ? = null,
        var loginIp : String ? = null,
        var loginDate : LocalTime ? = null,
        var createDate : LocalTime ? = null,
        var updateBy : LocalTime ? = null,
        var updateDate : LocalTime ? = null,
        var remarks : LocalTime ? = null,
        var delFlag : LocalTime ? = null
):BaseEntity() , Serializable