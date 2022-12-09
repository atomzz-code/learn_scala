package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1. 创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(23,57,92)

    println(arr1.mkString(","))
    println(arr2)

    //2。访问元素
    println(arr2(0))
    arr2(1) = 19
    println(arr2)

    //3.添加元素
    val newArr1 = arr1 :+ 15
    println(newArr1)

    arr1 += 19
    println(arr1)

    19 +=:arr1
    println(arr1)

    arr1.append(36)
    arr1.prepend(11)
    println(arr1)
    arr1.insert(1, 13,59) //insert
    println(arr1)
    arr1.insertAll(1, newArr1)
    arr1.appendAll(newArr1)
    //arr1.prepend(newArr1)


    //4.删除元素
    println(arr1)
    arr1.remove(3,2)
    println(arr1)

    arr1 -=15
    println(arr1) //删除第一个

    //5.可变数组转换为不可变数组 .toArray
    val arr = ArrayBuffer(23,56,98)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(", "))
    println(arr)

    //6.不可变数组转变为可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)
  }

}
