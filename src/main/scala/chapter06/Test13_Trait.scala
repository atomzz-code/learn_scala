package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.study()
    student.dating()
    student.play()

  }

}

//定义一个父类
class Person13{
  val name: String = "person"
  var age: Int = 18
  def sayHello(): Unit ={
    println("hello from: " + name)
  }
  def increase():Unit = println("Person13 increase")
}

// 定义一个特质
trait Young{
  // 声明抽象和非抽象属性
  var age: Int
  val name: String = "young"

  // 声明抽象和非抽象方法
  def play():Unit ={
    println(s"young people $name is playing")
  }
  def dating():Unit
}

class Student13 extends Person13 with Young {
  // 重写冲突的属性
  override val name: String = "student"
  //实现抽象方法
  def dating():Unit = println(s"student $name is dating")

  def study():Unit = println(s"student $name is studying")

  //重写父类
  override def sayHello(): Unit = {
    super.sayHello() //调父类方法
    println("Hello from " + name)
  }

}
