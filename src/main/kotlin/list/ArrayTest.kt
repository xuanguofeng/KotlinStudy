package list

import com.sun.xml.internal.fastinfoset.util.StringArray

//数组。。。


//定义数组

val array1: IntArray = intArrayOf(13, 3, 2, 32, 423, 234, 23, 23, 2)
val char1: CharArray = charArrayOf('a', 's')
val string1: Array<String> = arrayOf("xua", "dsf")


fun main(args: Array<String>) {
    println(string1[0])
    println(array1.joinToString("--"))//将数组以某种方式连起来
    println(array1.slice(1..2))//

    for (i in array1) {
        print("$i,")
    }



}