package chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    //如何扩展适用性
    // 1. 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    //2. 拓展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    //3. 将固定加数作为另一个参数传入，但是作为"第一层"参数传入
    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    println(addByA(35)(24))
    val addByFour2 = addByA(4)

    println(addByFour2(13))

    //4. lambda表达式简写

    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }

    }

    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    def addByA3(a: Int): Int => Int = a + _

    val addByFour3 = addByA3(4)
    println(addByFour3(13))
    //闭包：如果一个函数，访问到了它外部（局部）变量的值，那么这个函数和他所处的环境，称为闭包

    //5. 函数柯里化： 把一个参数列表的多个参数，变成多个参数列表。
    def addCurrying(a:Int)(b:Int):Int = {
      a + b
    }
    println(addCurrying(35)(24))
    val f5=addCurrying(4)(_)
    println(f5(5))

    // 递归： 一个函数/方法在函数/方法内又调用了本身，我们称之为递归调用
  }
}
