package chapter06
/*
特质VS抽象类
1. 优先使用特质。一个类扩展多个特质是很方便的，但却只能拓展一个抽象类
2. 如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，而特质不行
 */

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student15 = new Student15
    student15.increase()

    //钻石问题: Myclass > color > category > ball 从右到左
    val myFootBall = new MyFootBall
    println(myFootBall.describe())


  }

}
// 钻石问题： 特征叠加
// 定义球类
trait Ball {
  def describe(): String = "ball"
}
// 定义颜色特征
trait ColorBall extends Ball {
  val color: String = "red"
  override def describe(): String = color + "-" + super.describe()
}

//定义种类
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

//定义一个自定义球类
class MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a " + super.describe()
}
trait Knowledge15{
  var amount: Int = 0
  def increase(): Unit={
    println("knowledge increased")
  }

}

trait Talent15{
  def singing(): Unit
  def dancing(): Unit
  def increase():Unit = println("talent increased")
}

class Student15 extends Person13 with Talent15 with Knowledge15{
  override def dancing(): Unit = println("dancing")

  override def singing(): Unit = println("singing")

  override def increase(): Unit = {
    super.increase()
    // 父类子类和特征平等。从右到左叠加。返回调用最后一个特征
    super[Person13].increase() //可以指定
  }
}

