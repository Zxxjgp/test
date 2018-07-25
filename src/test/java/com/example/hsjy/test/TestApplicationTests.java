package com.example.hsjy.test;

import com.example.hsjy.test.entity.Person;
import com.example.hsjy.test.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {


    @Test
    public void contextLoads() {

    }

    @Test
    public  void gt(){
        Student student = new Student(20160001, "孔明", 20, 1, "土木工程", "武汉大学");
        String value = "something";
        System.out.println("======================"+Optional.ofNullable(value).map(String::toUpperCase).orElse("NONE"));
        String values = null;
        System.out.println("======================"+Optional.ofNullable(values).map(String::toUpperCase).orElse("NONE"));
        Optional<Student> empty = Optional.ofNullable(student);
        Person p= new Person();
        Optional<Person> personempty = Optional.ofNullable(p);
        Optional<String> stringempty = Optional.ofNullable(null);
        System.out.println(stringempty.isPresent());

    }

}
