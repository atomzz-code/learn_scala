package chapter06

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2
    student2.name = "alice"
    student2.age = 18
    println(s"student2: name = ${student2.name}, age = ${student2.age} ")


    val student3 = new Student3("bob",20)
    println(s"student3: name = ${student3.name}, age = ${student3.age}")

    val student4 = new Student4("carry",25)
    student4.printerInfo()

    val student5 = new Student5("bob", 20)
    println(s"student5: name = ${student5.name}, age = ${student5.age}")

    val student6 = new Student6("bob", 20, school = "sdfsd")
    println(s"student6: name = ${student6.name}, age = ${student6.age}")
    student6.printerInfo()



    }
  }

//定义类
//无参构造器
class Student2 {
  // 单独定义属性
  var name: String = _
  var age: Int = _
}

//上面定义等于直接等价于在主构造器中传入参数 ******推荐写法
class Student3(var name: String, var age: Int)

// 主构造器参数无修饰
class Student4(name: String, age: Int){
  def printerInfo(): Unit = {
    println(s"student4: name = ${name}, age = ${age}")
  }
}

//不推荐
class Student44(_name: String, _age: Int){
  var name: String = _name
  var age: Int = _age
}

//值不可更改
class Student5(val name: String, val age: Int)

//主构造方法 + 辅助构造方法
class Student6(var name: String, var age: Int){
  var school: String = _

  def this(name: String, age: Int, school: String){
    this(name, age)
    this.school = school
  }
  def printerInfo(){
    println(s"student6: name = ${name}, age = ${age}, school = ${school}")
  }
}