package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //自动提升原则
    val a1: Byte = 10
    val b1: Long = 2453L
    val result1: Long = a1 + b1
    val result11: Int = a1 + b1.toInt //强转

    //精度大的赋值给精度小的数值类型时， 报错
    val a2: Byte = 10
    val b2: Int = a2
    val c2:Byte = b2.toByte //报错 需要强转

    //byte short and char 之间不能直接转换 需要都先转化成int
    val a3: Byte = 10
    val b3: Char = 'b'
   // val c3: Byte = b3 //error
    val c3:Int = b3

    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'
    val result4: Int = a4 + b4
    println(result4)
    val result44: Int = a4 + b4 + c4
    println(result44)


    /**
     * 强制类型转换
     */
    val n1: Int = 2.5.toInt //取整数部分 截断
    println(n1)

    //强转的符号只针对最近的操作数有效
    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6+3.7).toInt
    println("n2: " + n2)
    println("n3: " + n3)

    //数值类型和string类型转换
    val n: Int = 27
    val s: String = n + ""
    println(s)

    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.3".toDouble.toInt
    println(f2)
  }

}
