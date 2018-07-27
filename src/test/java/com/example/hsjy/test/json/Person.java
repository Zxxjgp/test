package com.example.hsjy.test.json;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.json
 * @ClassName: Person
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/27 8:48
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/27 8:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@JsonFilter("no-name")
public class Person {
    private String id;
    private String name ;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
