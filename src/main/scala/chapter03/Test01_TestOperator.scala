package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {

    //整数除法， 如果想要小数， 至少一个值是小数
    val result1 = 10 /3
    println(result1)

    val result2:Double = 10.0 / 3
    println(result2)

    val result3: Double = 10.0 / 3
    println(f"${result3}%5.2f")

    val result4: Int = 10 % 3
    println(result4)

    // 2. 比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    //判断数值相等
    println(s1 == s2)
    println(s1.equals(s2))
    //判断引用地址相等
    println(s1.eq(s2))

    //3. 逻辑运算符 &&
    //与判断，第一个值false第二个值不会被调用，可以利用此特性编程，短路
    def m(n:Int): Int = {
      println("m被调用")
      return n
    }
    println("===================")
    val n = 1
    println((4 > 5) && m(n) > 0)

    //判断字符串是否为空, 需要包含null,空白字符的情况，
    def isNotEmpty(str:String):Boolean = {

      //return !(str == "") // if str = null 会 返回true 但是实际是空 报错
      return str != null && !("".equals(str.trim)) //trim去掉空白字符
    }
    println(isNotEmpty(null))
    println(isNotEmpty(("   ")))

    //4. 赋值运算符
    var b: Byte = 10
    var i: Int = 12
    //b += 1
    i += 1
    println(i)


    //5. 位运算符
    val a = 60
    println(a << 3) //乘以8（2的三次方）自动转int
    println(a >> 2)

    val c: Short = -13
    println(c << 2)
    println(c >> 2) //向下取证
    println(b >>> 2) //无符号右移动


    //6. 运算符的本质： 对象的方法调用,各种符号都是一个方法
    //一切皆对象
    val n1: Int = 12
    val n2: Int = 37
    println(n1.+(n2))

    println(1.34.*(25))

    println(7.5 toString)
    println(7.5 toInt )


  }

}
