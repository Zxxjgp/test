package com.example.hsjy.test.test20180919.readResources;

import org.apache.tomcat.jni.Local;
import org.hibernate.id.UUIDGenerator;
import org.junit.Test;
import org.springframework.beans.propertyeditors.UUIDEditor;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.assertEquals;

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
    public static void main(String[] args) throws UnsupportedEncodingException {
        //Locale local = Locale.CHINA;
        Locale local = new Locale("en","US");
        ResourceBundle resourceBundle= ResourceBundle.getBundle("cn.com.Mes",local);

       //String info = resourceBundle.getString("infos");
        String s = new String(resourceBundle.getString("info").getBytes("ISO-8859-1"), "UTF-8");

        System.out.println(MessageFormat.format(s,"秦康",new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
        System.out.println(s);

        System.out.println(UUID.randomUUID().toString().replaceAll("-",""));


    }
    @Test
    public void whenCreateOfNullableOptional_thenOk() {
        String name = "";
        Optional<String> opt = Optional.ofNullable(name);

        System.out.println( opt.get());
    }
}
