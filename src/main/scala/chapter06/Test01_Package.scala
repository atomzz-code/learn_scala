


  //包的三大作用
  //1. 区分相同名字的类
  //2. 当类很多时，可以很好管理类
  //3.控制访问范围

  //用嵌套风格定义包
package  com{

  import com.atguigu.scala.Inner

  //在外层包中定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
      //在外层访问内层的方法，需要导包
    }

  }
  package atguigu{
    package scala{
      //在内层包中定义单例对象
      object Inner{
        val in: String = "in"
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)

        }

      }

    }
  }
}
//在同一文件中定义多个包
package aaa{
  package bbb{

    import com.atguigu.scala.Inner

    object Test01_Package{
      def main(args: Array[String]): Unit = {
        println(Inner.in)
      }
    }
  }
}


