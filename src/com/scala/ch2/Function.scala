package com.scala.ch2

/**
  * 类似JAVA8接口函数
  * def 定义一个函数
  * def 函数名()
  */

object Function {
  def main(args: Array[String]): Unit = {
    print(abs(-1))
  }
  //lamda表达式
  def abs(x : Double) = if(x >= 0) x else  -x;
  //正常
  //函数内最后的一个表达式的值就是返回值
  def fac(n: Int) ={
    var r = 1
    for(i<-1.to(n)) r = r * 1
    r
  }

  //递归函数
  //必须指定返回类型
  def fac1(n : Int): Int = if(n<=0) 1 else n * fac1(n-1)
}
