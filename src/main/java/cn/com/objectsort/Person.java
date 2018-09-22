package cn.com.objectsort;

import org.jetbrains.annotations.NotNull;

/**
 * @ProjectName: test
 * @Package: cn.com.objectsort
 * @ClassName: Person
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/20 21:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/20 21:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Person implements Comparable<Person> {
    private String name ;
    private int age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "当前名字"+this.name+"年龄为"+this.age;
    }


    @Override
    public int compareTo(Person o) {
        return o.age - this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
