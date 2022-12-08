/*
package chapter06

object Test02_PackageObject {
  def main(args: Array[String]): Unit = {
    commonMethod()
    println(commonValue)
  }
}
*/
package chapter06{
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }

}
//包对象和包必须在同一层级
package ccc {
  package ddd{
    object Test02_PackageObject{
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }

  }

  package object ddd {
    val school: String = "dkhdsksfshd"
  }
}

package object ddd{
  val school: String ="dkhdsksfshd"
}

