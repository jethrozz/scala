package com.scala.ch3

import scala.collection.mutable.ArrayBuffer

/**
  * 定长数组 Array
  * 变长数组 ArrayBuffer
  */

object ArrayTest {
  def main(args: Array[String]): Unit = {
    array();
    arrayBuffer()
  }

  def array(){
    val nums = new Array[Int](10);  //数组长度为10，默认初始值为0
    var strings = new Array[String](10); //长度为10，默认初始值为null
    var s = Array("hello", "world");   //有初始值不需要用new

    println(s(0)+" "+s(1));  // 数组访问使用()
  }

  def arrayBuffer(): Unit ={
    var nums = new ArrayBuffer[Int]();
    var strings = new ArrayBuffer[String]();

    //使用+=向其末尾添加数据
    nums += 1  // Array(1)
    nums += 2
    nums += 3
    //也可以添加多个
    nums += (4,5,6)
    nums ++= Array(7,8,9,10)

    //在任意位置添加元素,其后元素将会直接平移 insert(index,elem)
    nums.insert(3,33)
    //在任意位置添加多个元素 insert(index,elem1,elem2,elem3 ...)
    nums.insert(5,15,25,35)

    //使用toArray 转换成定长数组
    //数组遍历如下
    for(i <- nums.toArray){
      print(i+" ")
    }
    println()


    //数组转换，从一个已存在的数组生成一个新的数组

    val newArray = for (item <- nums.toArray) yield item*2+"s"

    for(i <- newArray){
      print(i+" ")
    }
    println()

    val numsArray = nums.toArray






    //利用过滤器筛选并生成新的数组
    val newnumsArray = numsArray.filter{ _ % 2 == 0 } map {_ * 2}

    for(i <- newnumsArray){
      print(i+" ")
    }
    println()
  }


}
