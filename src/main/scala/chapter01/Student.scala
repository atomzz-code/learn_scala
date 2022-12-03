package chapter01

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + this.age + " " + Student.school)

  }

  }
// 引入伴生对象, 相伴相生，可以互相饮用
// 名称必须一样，必须放在一个文件里
object Student{
  val school: String = "atgdkd"

  def main(args: Array[String]): Unit = {
    val alice = new Student(name="alice", age = 20)
    val bob = new Student(name="bob", age = 23)
    alice.printInfo()
    bob.printInfo()
  }
}
