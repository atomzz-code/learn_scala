package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    //惰性加载：当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。
    //这种函数我们称之为惰性函数。
    lazy val result: Int = sum(13, 47)

    println("1.函数调用")
    println("2.result = " + result)
    println("4.result = " + result)

  }
  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    a + b
  }
}
