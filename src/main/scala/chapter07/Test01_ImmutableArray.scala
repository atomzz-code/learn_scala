package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1. 创建数组 （数组不可变，值可变）
    val arr: Array[Int] = new Array[Int](5)
    //另一种赋值方式
    val arr2 = Array(12, 37 , 42, 58, 97)

    //2. 访问元素
    println(arr2(0))
    println(arr2(1))
    println(arr2(4))

    arr2(0) = 12
    arr2(4) = 57

    //3. 数组的遍历
    //1）普通for循环
    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }

    for (i <- arr.indices) println(arr(i)) //推荐

    //2) 直接遍历所有元素， 增强for循环
    for (elem <- arr2) println(elem)

    //3) 迭代器
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())

    //4)调用foreach方法
    arr2.foreach((elem) =>println(elem))
    arr2.foreach(println)

    //转换成String打印出来
    println(arr2.mkString("-"))

    //4.添加元素
    val newArr = arr2.:+(73)
    println(newArr.mkString("-"))

    val newArr2 = newArr.+:(30)
    println(newArr2.mkString("-"))

    val newArr3 = newArr2 :+ 15
    val newArr4 = 19 +: 29 +:newArr3:+26
    println(newArr4.mkString("-"))
  }

}
