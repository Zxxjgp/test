package cn.com.objectsort.string.buffer;

import java.util.Arrays;
import java.util.Random;

/**
 * @ProjectName: test
 * @Package: cn.com.objectsort.string.buffer
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/21 21:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/21 21:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {

    private static Random random = new Random();

    public static void main(String[] args) {
/*        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 'a'; i < 'z'+1; i++) {
            stringBuffer.append((char) i);
        }
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());*/
        String parrent = "\\w+\\.\\w+";

        int result[] = Test.create(5);
        System.out.println(new Random().nextInt(1));
        System.out.println(Arrays.toString(result));
        System.out.println(validateIP("192.168.1.2"));
    }

    public static int[] create(int lenght){
        int date[] = new int[lenght];
        int foot =0;
        while (foot < date.length){
            int num = random.nextInt(30);
            if (num != 0){
                date[foot ++] = num;
            }
        }
        return date;

    }

    public  static  boolean validateIP(String ip){

        if (ip ==null || "".equals(ip)){
            return false;
        }
        String regex = "([12]?[0-9]?[0-9]\\.){3}([12]?[0-9]?[0-9])";

        if ( ip.matches(regex)){
            String re[] = ip.split("\\.");
            for (int i = 0; i <re.length ; i++) {
                int temp = Integer.parseInt(re[i]);
                if (temp > 255){
                    return false;
                }

            }
        }else {
            return false;
        }


        return true;
    }
}
