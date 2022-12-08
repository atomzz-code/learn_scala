package chapter05

object Test11_ControlAbstraction {

    def main(args: Array[String]): Unit = {
      //1. 传值参数
      def f0(a: Int): Unit = {
        println("a: " + a)
      }


      def f1(): Int = {
        println("f1调用")
        12
      }

      f0(f1())

      println("=============================")
      //2. 传名参数, 传递可执行代码块
      def f2(a: =>Int): Unit = {
        // =>Int: 表示一段代码块，且返回值为Int
        //a用几次，函数被调用几次
        println("a: " + a)
        println("a: " + a)
      }
      f2(f1)

      f2(
        {
          println("这是一个代码块")
          29
        }
      )



    }




}
