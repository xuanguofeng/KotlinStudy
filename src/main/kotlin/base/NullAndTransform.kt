package base

/**
 * 空类型和智能类型转换
 * Created by xuanguofeng on 2017/6/29.
 */
open class NullAndTransform {


}

fun getName(): String {//一个返回值为String类型的函数

    // return null //如果返回null 编译器会报错

    return "test"
}

fun getNameNull(): String? {//问号代表可以返回null
    return null
}


fun main(args: Array<String>) {
    if (getName() != null) {//如果这么写编译器会提示，不需要，因为getName方法不会返回null
        println(getName().length)
    }

    println(getNameNull()?.length)//? 代表可能是null,如果是null则返回null，不为null 就返回长度

//    val name: String = getNameNull() ?: return //进行判断，如果getNameNull()是null的话就执行冒号后面的语句
    val name2: String = getNameNull() ?: "ttttttttt"
    println(name2?.length)//如果加问号会提示没有必要，因为name 不可能为null,
    println(name2.length)//


    val value:String ?="fdsa"
    println(value!!.length)//如果直接调用会提示可能为null 可以通过添加 !!来告诉编译器不用管，
                           // 这变量已经充分了解不会为null,如果value确实为null
                           // 则	at base.NullAndTransformKt.main(NullAndTransform.kt:38)报空指针


//------------------------类型转换---------------------------------------------

    val parent:Parent=Child()


    if(parent is Child){
        println(parent.syso())//根据语意 智能转换
    }

    val mstring:String?="hello"

    if(mstring!=null){
        println(mstring.length)
    }


    val parentNew:Parent= Parent()

    //不安全写法 val childeNew:Child?=parentNew as Child //强制类型转换  直接这么写 也会抛出类型转换异常
    //安全写法

    val childeNew:Child?=parentNew as? Child //如果类型转换失败会返回null 不会抛出异常


}

