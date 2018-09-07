package com.example.hsjy.test.entity

import java.io.Serializable
import java.util.*

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.entity
 * @ClassName:      BaseEntity
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/7 14:42
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/7 14:42
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
open class BaseEntity(var createBy : String ? = null,var createTime : Date ? = null): Serializable