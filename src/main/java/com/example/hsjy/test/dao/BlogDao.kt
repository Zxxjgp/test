package com.example.hsjy.test.dao

import com.example.hsjy.test.entity.Person
import org.apache.ibatis.annotations.Mapper

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.dao
 * @ClassName:      BlogDao
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/8/2 15:39
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/8/2 15:39
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Mapper
interface BlogDao {
    fun finAll() : List<Person>
}