package base







val rang: IntRange =0..1024  //表示0-1024的区间 闭区间  [0-1024]
var rang1:IntRange=0 until 1024  // 半开区间  [0-1024) 0-1023


var  a:IntRange=0..-1

fun main(args: Array<String>) {
    println(a.isEmpty()) //a是否是空
    println(rang.contains(103))//区间是否包含103
    println(200 in rang)


    for (i in rang){
        print("$i,")
    }



}