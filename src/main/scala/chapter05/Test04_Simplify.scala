package chapter05

object Test04_Simplify {
  def main(args: Array[String]): Unit = {
    def f0(name: String):String = {
      return name
    }
    println(f0("adffe"))


    //1. return 可以省略
    def f1(name: String): String = {
      name
    }

    println(f1("adffe"))

    //2. 如果函数体只有一行， 可以省略花括号
    def f2(name: String): String = name

    println(f2("adffe"))

    //3. 如果返回值的类型可推断出来， 那么 可以省略
    def f3(name: String) = name

    println(f3("adffe"))

    //4. 如果有return， 则不能省略返回值类型
    def f4(name: String): String = {
      return name
    }

    println(f4("adffe"))
    //5. 如果函数明确声明unit，那么即使使用return页不起作用


    //6. 如果没有返回值， 可省略 =, 过程
    def f6(name:String): Unit = {
      println(name)
    }

    //7. 如果函数无参，但是声明了参数列表，那么调用时， 小括号， 可加可不加
    def f7():Unit = {
      println("fdsjfsdfksd")
    }
    f7
    //8. 如果函数没有参数列表， 那么小括号可以省略， 调用时小括号必须省略
    def f8: Unit = {
      println("fdsjfsdfksd")
    }

    f8

    //9， 如果不关心名称， 只关心逻辑处理，那么函数名（def）可以省略
        
        //匿名函数，lambda表达式
    (name: String) => {println(name)}


  }

}
