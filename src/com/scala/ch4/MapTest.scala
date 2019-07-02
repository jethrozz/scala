package com.scala.ch4

import scala.collection.mutable

/**
  * 可变映射  Map
  * 不可变映射 Map
  * 可变指长度可变
  *
  * 排序映射（不可变）: SortedMap
  *
  * LinkedHashMap
  *
  */
object MapTest {
  def main(args: Array[String]): Unit = {
    //不可变映射
    //创建一个 string -> int 类型的map
    val finalMap = Map( ("x",10), "y"->20);
    //可变映射
    val changeableMap1 = scala.collection.mutable.Map( ("x",10), "y"->20)
    //生成一个空的可变映射
    val changeableMap2 = new mutable.HashMap[String,Int]()

    //存放值
    changeableMap2.put("z",1);
    //获取值
    val value = changeableMap2.get("z")
    println(value.get)
    //获取值如果不存在，则返回默认值
    println(changeableMap2.getOrElse("x",2))
    //获取值如果不存在，则返回默认值,并将其添加至map中
    println(changeableMap2.getOrElseUpdate("x",3))
    println(changeableMap2.getOrElse("x",2))


    //迭代映射
    for((k,v) <- changeableMap2){
      //迭代处理 k,v
      println("key ："+k+", value ："+v)
    }
  }



}
