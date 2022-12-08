package chapter05

import scala.annotation.tailrec


object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }


  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1
    return fact(n - 1) * n
  }

  // 递归计算机执行上，会消耗额外资源，栈溢出stack overflow

  // 尾递归
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, currRes: Int):Int = {
      if (n==0) return currRes
      loop(n-1, currRes*n)
      //每次不用保存所有信息，直接 currRes 和 n 覆盖掉, 减少栈空间使用
    }
    loop(n, 1)
  }
  

}
