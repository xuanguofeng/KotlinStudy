package base

/**
 * Created by xuanguofeng on 2017/6/29.
 */

val mString:String="hello,word!"
val fromChars:String= String(charArrayOf('h','e','l','l','o',',','w','o','r','d','!'))


fun main(args: Array<String>) {

    println(mString)
    println(fromChars)
    println(mString==fromChars)// == : 表示的是java中的equals比较的是值 所以返回true
    println(mString=== fromChars) // === : 表示的是引用，和java中的==一样
    println("输出："+ mString)

    val a:Int=1
    val b:Int=2
    println(""+a+"+"+b+"="+(a+b))
    println("$a+$b=${a+b}")//kotlin中支持的字符串模版

    val  ysZFC:String="""\n
            \r  这是一个原始字符串，怎么写怎么打印
        """
    println(ysZFC)

    println(ysZFC.length)


}
