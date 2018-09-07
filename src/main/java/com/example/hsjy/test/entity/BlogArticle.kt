package com.example.hsjy.test.entity

import lombok.Data
import java.io.Serializable

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.entity
 * @ClassName:      BlogArticle
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/7 14:44
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/7 14:44
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
@Data
class BlogArticle(
        var id : String ? = null,
        var title : String ? = null,
        var content : String ? = null
) : BaseEntity(),Serializable