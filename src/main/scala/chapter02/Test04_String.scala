package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // +拼接
    val name: String = "alice"
    val age: Int = 18
    println(age + " years old" + name + "in Sweden.")

    //重复输出
    println(name * 3)

    //printf
    printf("%d岁的%s在瑞典", age, name)
    //换行
    println()

    //字符串模版
    println(s"${age} years old ${name} is in Sweden.")

    val num: Double = 2.3456
    println(s"The number is ${num}")
    // 整数长度2 小数长度2
    println(f"The number is ${num}%2.2f")
    println(raw"The number is ${num}%2.2f")


    // 三引号表示字符串，保留原格式，SQL
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       | age > ${age}
       |""".stripMargin
    println(sql)






  }

}
