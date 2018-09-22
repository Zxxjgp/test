package com.example.hsjy.test.test.resbould;

import java.util.ResourceBundle;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test20180919.readResources
 * @ClassName: ReadTestRecources
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/19 17:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/19 17:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ReadTestRecources {
    public static void main(String[] args) {
        ResourceBundle resourceBundle= ResourceBundle.getBundle("Mes");
        String info = resourceBundle.getString("info");
        System.out.println(info);

    }
}
