package com.example.hsjy.test.hsjycrm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.hsjycrm.entity
 * @ClassName: CrmPerson
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/17 22:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/17 22:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
@Builder
public class CrmPerson implements Serializable {

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime localDateTime;
}
