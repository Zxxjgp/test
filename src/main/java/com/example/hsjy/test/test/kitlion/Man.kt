package com.example.hsjy.test.test.kitlion

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.test.kitlion
 * @ClassName:      Man
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/6 22:48
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/6 22:48
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class Man :Human(), IMAN {
    override fun eat() {
        println("wawa的吃饭    ")
    }

    override fun xiaodidi() {
        println("这个是我的大哥你是谁啊")
    }
}

fun main(args: Array<String>) {
    var range = 1 .. 100
    var j = 100 downTo  2
    var k = range.reversed()
    k.forEach { println(it) }


    j.forEach{
        println(it)
    }
    range.forEach {
        println(it)
    }
}
