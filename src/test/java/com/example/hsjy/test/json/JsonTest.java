package com.example.hsjy.test.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.assertj.core.util.Sets;
import org.junit.Test;
import com.example.hsjy.test.entity.Person;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.json
 * @ClassName: JsonTest
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/27 8:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/27 8:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class JsonTest {
    @Test
    public  void testJson() throws JsonProcessingException {/*
        Person person = new Person("e","qina");
        System.out.println(setupJsonFilter().writeValueAsString(person));
        Set<Person> personSet = Sets.newHashSet();
        personSet.add(person);
        personSet.forEach(x -> System.out.println(x));*/

    }
    private static ObjectMapper setupJsonFilter(){
        ObjectMapper mapper = new ObjectMapper();
        String[] beanProperties = new String[]{"name"};
        String nonPasswordFilterName = "no-name";//需要跟User类上的注解@JsonFilter("non-password")里面的一致
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter(nonPasswordFilterName, SimpleBeanPropertyFilter.serializeAllExcept(beanProperties));
        //serializeAllExcept 表示序列化全部，除了指定字段
        //filterOutAllExcept 表示过滤掉全部，除了指定的字段
        mapper.setFilterProvider(filterProvider);
        return mapper;
    }

    public static void main(String[] args) throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass("com.example.hsjy.test.entity.Person");
        Person person = (Person) clazz.newInstance();
        Field[] file = clazz.getDeclaredFields(); //获取类里面多有的属性
       // System.out.println(file[4]);
        Method[] p = clazz.getMethods();
      //  System.out.println(p[2]);

        Constructor[] constructor = clazz.getConstructors();
        System.out.println(constructor[0].getParameterCount());
        System.out.println(constructor[0].getParameters());
    }

    @Test
    public  void fileClassloader() throws IOException, ClassNotFoundException {
        Resource pathResource = new ClassPathResource("file/file.txt");
        InputStream stream = pathResource.getInputStream();
        File file = pathResource.getFile();

        System.out.println(file.getAbsolutePath());
        stream.close();
/*        WritableResource w = new PathResource("D:/workspace/idea/nihao/test/src/main/resources/file/file.txt");
        OutputStream o = w.getOutputStream();
        o.write("你好啊".getBytes());
        o.close();*/
    }
}
