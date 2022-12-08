package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
    //    person.idCard //私有
    //    person.name //受保护访问权限， 只在当前类和子类可访问
    println(person.age)
    println(person.sex)

    person.printerInfo()

    val worker: Worker = new Worker()
    worker.printerInfo()
  }

}
//定义一个子类
class Worker extends Person {
  override def printerInfo(): Unit = {
//    println(idCard) //私有
    name = "bob"
    age = 25
    sex = "male"

    println(s"Worker: ${name} ${sex} ${age}")
  }
}