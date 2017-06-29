package base

/**
 * Created by xuanguofeng on 2017/6/29.
 */
class Book(var name:String,var price:Int,var page:Int){


    override fun toString(): String {
        return "Book(name='$name', price=$price, page=$page)"
    }
}

fun main(args: Array<String>) {

    val  book1: Book = Book("嫌疑人X的现身",20,999)
    println(book1.toString())
}