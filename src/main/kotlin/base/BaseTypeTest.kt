package base


fun main(args: Array<String>) {
    println("hello word")


    val aBoolean1:Boolean=true
    val aBoolean2:Boolean=false

    println(aBoolean1)
    println(aBoolean2)
    println(aBoolean1==aBoolean2)


    val aInt:Int=8
    val bInt:Int=0xff
    println(aInt)
    println(bInt)
    println(Int.MAX_VALUE)
    println(Math.pow(2.0,31.0)-1)

    val aLong:Long=1L
    val bLong:Long=2342049820343333333

    println(aLong)
    println(bLong)

    val aFloat:Float=23.3f
    println(aFloat)

    println((0.0f/0.0f)===Float.NaN)//不是数

    //数据转换

//    val a:Int=1
//    val b:Long=a  //java中可以的类型转换  kotlin中不允许
//    println(b)


}