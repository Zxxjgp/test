package com.example.hsjy.test.test.kitlion

/**
 *
 * @ProjectName:    test
 * @Package:        com.example.hsjy.test.test.kitlion
 * @ClassName:      ThreadTest
 * @Description:     java类作用描述
 * @Author:         焦关平
 * @CreateDate:     2018/9/11 22:32
 * @UpdateUser:     更新者
 * @UpdateDate:     2018/9/11 22:32
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class TongBu : Thread(){
    private var count : Int = 10
   override fun run() {
        super.run()
        count --
        println("有"+ currentThread().name+"计算"+this.count)
    }
}

fun main(args: Array<String>) {
    val tongBu =  TongBu()
    val h1 = Thread(tongBu,"A")
    val h2 = Thread(tongBu,"B")
    val h3 = Thread(tongBu,"C")
    val h4 = Thread(tongBu,"D")
    val h5 = Thread(tongBu,"F")
    h1.start()
    h2.start()
    h3.start()
    h4.start()
    h5.start()
}