package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("alice", 18)
    println("===========================")
    val student2 = new Student7("bob", 20, "std001")
    println("===========================")
    val teacher = new Teacher
    teacher.printerInfo()

    //多态
    //同一接口有多种不同的实现
    //动态绑定， 编译时不绑定方法，运行时绑定

    def personInfo(person: Person7): Unit = {
      person.printerInfo()
    }
    println("===========================")
    val person = new Person7
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)


  }

}




// 定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int){
    this()
    println("2.父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printerInfo(): Unit = {
    println(s"Person: ${name} ${age}")
  }
}

// 定义子类: 调用Person7 主构造器

//class Student7(name: String, age: Int) extends Person7(name, age) 传参数调用父类辅助构造器
class Student7(name: String, age: Int) extends Person7 {
  var stdNo: String = _
  println("3.子类的主构造器调用")
  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4.子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printerInfo(): Unit = {
    println(s"Person: ${name} ${age} $stdNo")
  }
}

class Teacher extends Person7 {
  override def printerInfo(): Unit = {
    println(s"Teacher")
  }

}