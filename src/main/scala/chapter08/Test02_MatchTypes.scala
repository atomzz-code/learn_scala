package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    //1.匹配常量
    def describeConst(x:Any):String = x match {
      case 1 => "Num one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "char +"
      case _ => "-"
    }
    println(describeConst("hello"))
    println(describeConst(0.3))

    println("===============")
    //2.匹配类型
    def describeType(x: Any):String = x match {
      case i: Int => "Int" + i
      case s: String => "String " + s
      case list: List[String] => "List " + list //泛形擦除
      case array:Array[Int] => "Array[Int] " + array.mkString(", ")
      case a => "Something else" + a
    }
    println(describeType(35))
    println(describeType("hello"))
    println(describeType(Array("hi", "hello")))


    //3.匹配数组
    for (arr <- List(
      Array(0),
      Array(1,0),
      Array(0,1,0),
      Array(1,1,0),
      Array("hello",20,30)
    )){
      val result = arr match {
        case Array(0) => "0"
        case Array(1,0) => "Array(1,0"
        case Array(x,y) =>"Array: " + x + " "+ y //
        case Array(0,_*) => "以0开头的数组"   //
        case Array(x,1,z) => "中间为1的三元素数组"  //
        case _ => "something else"
      }
      println(result)
    }
    // 4. 匹配列表
    // 方式1
    for (list <- List(
      List(0),
      List(1,0),
      List(1,1,0),
      List(0,0,0),
      List(88)
    )){
      val result = list match {
        case List(0) => "0"
        case List(x, y) => "List(x,y): " + x + ", " + y
        case List(0,_*) => "List(0, ...)"
        case List(a) => "List(a): " + a
        case _ => "something else"
      }
      println(result)
    }
    // 方式2
    val list1 = List(1, 2, 5, 7, 24)
    val list = List(24)
    list match {
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("something else")
    }
    println("============")
    //5. 匹配元组
    for (tuple <- List(
      (0, 1),
      (0, 0),
      (0, 1, 0),
      (0, 1, 1),
      (1, 23, 56),
      ("hello", true, 0.5)
    )){
      val result = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "(0, _)"
        case (a, 1, _) => "(a, 1, _) " + a
        case _ => "something else"
      }
      println(result)
    }





  }

}
