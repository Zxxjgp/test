package cn.com.objectsort;

import java.util.Comparator;

/**
 * @ProjectName: test
 * @Package: cn.com.objectsort
 * @ClassName: PersonComparetor
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/20 21:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/20 21:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PersonComparetor implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
