package chapter04

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    //1.单分支
    if (age >= 18) {
      println("adult")
    }
    println("==============")
    // 双分支
    if (age > 18){
      println("adult")
    } else {
      println("teenager")
    }

    println("==============")
    //3. 多分支
    if (age <= 6) {
      println("childhood")
    } else if(age < 18) {
      println("teenager")
    } else if (age < 35){
      println("young")
    } else{
      println("elderly")
    }

    // 分支语句的返回值：if else 的返回值就是每个判断的最后一行
    // 如果不想返回可以定义返回值类型为unit
    // 如果返回值类型不同，定义为公共副类 any
    val reusltm: Any = if (age <= 6) {
      println("childhood")
      "童年"
    } else if (age < 18) {
      println("teenager")
      age
    } else if (age < 35) {
      println("young")
      "young"
    } else {
      println("elderly")
      "elderly"
    }

    println(reusltm)
    // java三元运算符类比
    val res = if (age >= 18) "adult" else "teenager"

    //5. 嵌套分支: 不推荐
    if (age > 18) {
      println("adult")
      if (age >= 35){
        "qingnian"
      }
    } else {
      println("teenager")
    }


  }

}
