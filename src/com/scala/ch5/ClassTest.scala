package com.scala.ch5

import scala.beans.BeanProperty

object ClassTest {
    class Car {
      /**
        * scala类中字段自动带有getter 和setter 方法 ,
        * scala类中的getter和setter 方法 以字段cap为例
        * getter方法  ： cap
        * setter方法  ： cap=
        */
      //@BeanProperty 生成getter 和setter方法
      //类中方法默认是公开的
      @BeanProperty
      var cap = 0;
      def run() = println("car running")
      def didi() = println("di di di")
    }

    class FireEnginesCar extends Car {
      @BeanProperty
      var waterCap = 10;
      def water() = {
        waterCap-=1
        println("喷水救火")}
      def load() = {
        println("消防员上车")
        cap+=1
      }

      override def run(): Unit = println("消防车开始启动")

      override def didi(): Unit = println("嘀嘀嘀----")
    }


  def main(args: Array[String]): Unit = {
    val fireEnginesCar = new FireEnginesCar();
    fireEnginesCar.load()
    fireEnginesCar.load()
    fireEnginesCar.run()
    fireEnginesCar.didi()
    println("车上消防员数量："+fireEnginesCar.cap)
    fireEnginesCar.water()
    println("车上可用水的数量："+fireEnginesCar.getWaterCap)
  }
}
