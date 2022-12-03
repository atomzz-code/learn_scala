package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    //声明变量常用语法
    //var=变量类型可省略，不可改，必须有初始值
    //val=常量，不可改
    var a: Int = 10
    var a1 = 10
    val a2 = 2

    //实际应用
    var alice = new Student(name = "alice", age = 20)
    alice = new Student(name = "Alice", age = 20)
    alice = null

    // val 的对象不可变(变量bob不可以赋值新实例)，对象的属性是否可变取决于类的定义
    val bob = new Student(name = "bob", age = 23)
    bob.age = 24
    bob.printInfo()




  }

}
