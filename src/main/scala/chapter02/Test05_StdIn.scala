package chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    //input informaiton
    println("Please input your name:")
    val  name: String = StdIn.readLine()
    println("Please input your age:")
    val age: Int = StdIn.readInt()

    println(s"welcome ${age} years old ${name} to Sweden! ")

  }

}
