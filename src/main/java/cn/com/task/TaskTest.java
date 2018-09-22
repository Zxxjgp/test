package cn.com.task;

import java.util.Arrays;
import java.util.Base64;


/**
 * @ProjectName: test
 * @Package: cn.com.task
 * @ClassName: TaskTest
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/20 17:05
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/20 17:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TaskTest {
    public static void main(String[] args) throws Exception{
   /*     Timer timer = new Timer();
        timer.schedule(new MyTask(),10,2000);*/

        /**
         * Base64进行加密
         */
        String salt = "saltJava";
        String str = "www.baidu.com"+"{"+salt+"}";
        String msg =  new String(Base64.getEncoder().encode(str.getBytes()));
        System.out.println(msg);

        /**
         * 解密
         */
        String s = new String(Base64.getDecoder().decode(msg));
        System.out.println(s);
        System.out.println(s.replaceAll("",""));




        Integer data[] = new Integer[]{10,52,65,2,45,52};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));


        String strw = StringUtils.encode("www.baidu.com");
        System.out.println(strw);

        String re = StringUtils.decdo(strw);
        System.out.println(re.replaceAll("\\{\\w+\\}",""));

    }
}

class StringUtils{
    private static final String salt = "mldnjava";
    private static final int times = 5;
    String msg = "www.baidu.com";

    /**
     * 加密
     * @param str
     * @return
     */
    public static String encode(String str){
        String temp = str + "{"+salt+"}";

        byte data[] = temp.getBytes();
        for (int i = 0; i <times ; i++) {
         data =   Base64.getEncoder().encode(data);
        }

        return new String(data);
    }

    public static String decdo(String string){
        byte data[] = string.getBytes();
        for (int i = 0; i <times ; i++) {
            data =   Base64.getDecoder().decode(data);
        }

        return new String(data);
    }
}