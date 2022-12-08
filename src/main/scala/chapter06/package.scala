package object chapter06 {
  //定义当前包共享的属性和方法
  val commonValue = "Gothenburg"
  def commonMethod() = {
    println(s"I am living in ${commonValue}")
  }

}
