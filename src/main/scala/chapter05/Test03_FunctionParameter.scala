package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // 1. 可变参数
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("aaa")
    f1("aaa", "bbb", "ccc" )

    //2. 如果参数列表中存在多个参数，那么可变参数一般放在最后
    def f2(str1: String, str2: String*): Unit ={
      println("str1: " + str1 + " str2: " + str2)
    }
    f2("alica")
    f2(str1 = "aaa",str2 = "bbb", "ccc")


    //3. 一般将有默认值的参数放在最后
    def f3(name: String= "atsfkfew"):Unit = {
      println("My schaool is " + name)
    }
    f3("school")
    f3()

    //带名参数
    def f4(name:String = "alice", age: Int): Unit = {
      println(s"${age}岁的${name}在瑞典学习")
    }
    f4(age=23)
  }

}
