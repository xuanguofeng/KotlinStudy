package base

import java.io.ObjectInputStream



/**
 * 对象-类的测试
 * Created by xuanguofeng on 2017/6/29.
 */
//class XYR constructor(var name:String, var price:Int, var page:Int): Book() {// 继承Book
//
//    init {//相当于构造方法的方法体
//        println("init.......：name:${name},prict:${price},page:${page}")
//    }
//
//    override fun toString(): String {
//        return "XYR(name='$name', price=$price, page=$page)"
//    }
//}


class BYX constructor(name: String,price: Int,page: Int):Book(name,price,page){


}

open class Book(var name:String, var price:Int, var page:Int) { //默认的类是final的不能被继承 使用open打开

    init {
        println("${this.javaClass.simpleName}")
    }

}



fun main(args: Array<String>) {

//    val  book1: XYR = XYR("嫌疑人X的现身",20,999)

    val byx:BYX= BYX("白夜行",22,323)
    println(byx.toString())

    println(byx is Book)    //判断byx是否是一本书  也就是说是否是 Book这个类或者子类

    println(byx is Any)     //kotlin中Any是所有的类的父类


}