package com.scala.ch2

/**
  * 变量 var
  * 常量 val
  */


object ConditionExpress {
  def main(args: Array[String]): Unit = {
    //单一类型表达式
    println("单一返回类型条件表达式")
    val i = 3
    val res = if (i > 5) i*2 else i/2
    println(res)

    //混合类型表达式
    println("混合返回类型条件表达式")
    val mix = if(i > 5) "hello" else i/2
    println(mix)

    //scala 中每种表达式都应该有返回值，用Unit表示空值写作(),()是一个无有用值得占位符

    //用()表示空值
    println("用()表示空值")
    val unit = if (i>5) "hello" else ()

    println(unit)


  }
}
