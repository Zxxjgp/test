package com.example.hsjy.test.test.thread;

import lombok.Builder;
import lombok.Data;
import sun.misc.Cleaner;

import java.util.function.*;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.test.thread
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/18 15:47
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/18 15:47
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
interface Utile<T,R>{
    public R zhuanhaun(T t);
}

interface Toup<R>{
    public R toup();
}

interface Compare<R ,T>{
    public R toup(T t1,T t2);
}
@Data
@Builder
class Person{
    private String name ;
    private Integer age;

/*
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
interface Per<P,S,T>{
    P create(S s, T t);
}



public class Test {
    public static void main(String[] args) {
   /*     Utile<Integer, String> ui = String::valueOf;
        String zhuanhaun = ui.zhuanhaun(1000);
        System.out.println(zhuanhaun.length());

        Toup<String> toup = "hello"::toUpperCase;
        System.out.println(toup.toup());

        Compare<Integer,String> compare = String::compareTo;
        Integer toup1 = compare.toup("A", "a");
        System.out.println(toup1);
*//*
        Per<Person,String,Integer> per = Person::new;
        System.out.println(per.create("张三",20));*//*


        Function<Integer,String> function= String::valueOf;
        System.out.println(function.apply(100000).length());
        Function<String,String > h = String::toUpperCase;
        System.out.println(h.apply("hewjdiwe"));



        IntFunction<String> j = String::valueOf;
        System.out.println(j.apply(10).length());


        Consumer<String> c = System.out::println;
        c.accept("我是中国人");

        Consumer<Integer> av = (x) ->{
            int  a = x+2;
            System.out.println(a);
        };
        av.accept(5);

        Consumer<Person> ava = x -> {
            x.setName("我是中国人");
            System.out.println(x);
        };
        Person p = new Person("张三",25);
        ava.accept(p);


        Supplier<String> s = "hello"::toUpperCase;
        System.out.println(s.get());


        *//*
        Predicate<String> predicate = "##hello"::startsWith;
        System.out.println(predicate.test("###"));*/

    /*    String str= "hello";
        change(str);
        System.out.println(str);*/

        Consumer<String> c = System.out::println;
        c.accept("我是中国人");

        String strV = "eqw"+"qwe";
         //线程安全类
        StringBuffer s = new StringBuffer("hello");
        change(s);
        System.out.println(s.toString());

        /*AutoCloseable 自动关闭资源*/
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        /**
         * 获取本机的内核数
         */

    }
    public static void change(StringBuffer string){
        string.append("Wolrd");
    }
}
