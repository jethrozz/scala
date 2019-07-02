package com.scala.ch2

/**
  * 循环表达式
  * for
  *
  * 以下两个同Java 一致
  * while
  * do while
  *
  *
  * 没有break 和 continue 语句
  */

object LoopExpress {
  def main(args: Array[String]): Unit = {
    //eg.  遍历Range
    //1.to(n)  返回一个1到n的Range，Range同Python
    /**
      * for(i <- express){}
      * 变量i会遍历表达式所有的返回值
      *
      */
    for ( i <- 1.to(10)){
      print(i+"-")
    }
    println()
    //eg.  1.to(n)
    val array = 1.to(7)
    println(array)


    //遍历字符串，or 数组
    var hello = "hello"
    var sum = 0
    //until 方法同 to 方法。to方法会返回最后一位，但是until不会返回最后一位
    //如 1.to(3)    return  1,2,3
    // 1.ubtil(3)   return 1,2
    for(i <- 0.until(hello.length)){
      println(hello(i))
      sum += hello(i)
    }


    //推导式循环
    println("for推导式")
    print("eg. 1: ")
    for(i <- 1.to(3); j <- 1.to(3) ){
      print((10 * i + j) + " ")
    }


  }
}
