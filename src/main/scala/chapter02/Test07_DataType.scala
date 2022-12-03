package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    val a1: Byte = 127
    val a2: Byte = -128
    // val a2: Byte =128 //error

    val a3 = 12 //Int
    val a4 = 1278949499900304L //long define
    val a5: Long = 1278949499900304L

    val b1: Byte = 10
    val b2: Byte = (10 + 20)

    //强制类型转换
    val b3:Byte = (b1+20).toByte
    println(b3)

    // 浮点类型 默认double
    val f1: Float = 1.23455F
    val d1 = 233434

    // 字符类型 '' 字符常量
    val c1: Char = 'a'
    println(c1)

    val c2:Char = '9'
    println(c2)

    val c3: Char = '\t' //制表符
    val c4: Char = '\n' //换行符
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    //转义字符
    val c5 = '\\'
    val c6 = '\"'
    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    // 字符变量底层保存的ASCII
    val i1:Int = c1
    println("i1: " + i1)
    val i2: Int = c2
    println("i2 " + i2)

    val c7: Char = (i1 +1).toChar
    println("c7: " + c7)

    val c8 = (i2 +1).toChar
    println("c8: " + c8)

    // boolen
    val isTrue: Boolean = true
    println(isTrue)

    //unit 空值
    def m1():Unit = {
      println("m1")
    }
    val a:Unit = m1()
    println(a)

    //Null 空引用
    var student: Student = new Student(name = "alice",age=20)
    student = null
    println(student)

    // Nothing
    def m2(n:Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }
    val b = m2(0)
    println(b)


  }
}
