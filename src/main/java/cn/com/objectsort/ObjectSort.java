package cn.com.objectsort;

import java.util.Arrays;

/**
 * @ProjectName: test
 * @Package: cn.com.objectsort
 * @ClassName: ObjectSort
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/20 21:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/20 21:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ObjectSort {
    public static void main(String[] args) {
       Person date[] = new Person[]{
               new Person("A",100),
               new Person("B",50),
               new Person("C",80)
       };
        Arrays.sort(date,new PersonComparetor());
        System.out.println(Arrays.toString(date));
    }
}
