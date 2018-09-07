package com.example.hsjy.test.test.kitlion

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.test.kitlion
 * @ClassName:      TestKotlin
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/6 15:18
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/6 15:18
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
fun main(args: Array<String>) {
    var sockrt = 65
    var result = if (sockrt < 95 ){
        println("及格")
    }else{
        println("不及格")
    }
    println(result)

    var result2 = if (sockrt < 95 ){
        println("及格")
        "考试通过"
    }else{
        println("不及格")
        "考试不通过"
    }
    println(result2)

    var  ma = Man()
    ma.xiaodidi()

    var ma2 = Taijian()
    ma2.eat()

    var  list = listOf<Human>(ma,ma2)
    for ( p in list){
        if (p is Man){
            p.eat()
        }
        p.eat()
    }

}
