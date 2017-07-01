package packagetest

import packagetest.a.Book
import  packagetest.b.Book as BBook


fun main(args: Array<String>) {

    val 白夜行: Book = Book()

//  val 嫌疑人X的现身: packagetest.b.Book = packagetest.b.Book() //说明：和java中一样，如果引用两个类名相同，则使用全类名

    val 嫌疑人X的现身: BBook=BBook()  //也支持别名的方式进行设置




}