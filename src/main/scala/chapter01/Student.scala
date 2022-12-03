package chapter01

class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + this.age + " " + Student.school)

  }

  }
// 引入伴生对象, 相伴相生，可以互相饮用
object Student{
  val school: String = "atgdkd"

  def main(args: Array[String]): Unit = {
    val alice = new Student(name="alice", age = 20)
    val bob = new Student(name="bob", age = 23)
    alice.printInfo()
    bob.printInfo()
  }
}
