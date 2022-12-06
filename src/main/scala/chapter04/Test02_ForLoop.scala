package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // java for 语法： for (int i=0; i<10;i++){
    //  System.out.printlin(i)}

    //1. 范围遍历 range
    //包含边界的遍历
    for (i <- 0 to 10){
      println(i + ". hello world")
    }
    for (i: Int <- 1.to(10)){
      println(i)
    }
    //不含边界的遍历
    for (i <- Range(1, 10)){
      println(i)
    }

    for (i <- 1 until 10){
      println(i)
    }
    //2. 集合遍历
    for (i <- Array(12,34,53)){
      println(i)
    }

    for (i <- List(12, 34, 53)) {
      println(i)
    }

    for (i <- Set(12, 34, 53)) {
      println(i)
    }

    // 3. 循环守卫
    for (i <- 1 to 10){
      if (i!=5){
        println(i)
      }
    }

    for (i <- 1 to 10 if i != 5 ){
      println(i)
    }

    //4. 循环步长
    for (i <- 1 to 10 by 2 ){ //(1 to 10).by(2)
      println(i)
    }

    for (i <- 13 to 30 by 3){
      println(i)
    }

    //负步长，递减
    for (i <- 30 to 13 by -2) {
      println(i)
    }

    for (i <- 10 to 1 by -1) {
      println(i)
    }

    for ( i<- 1 to 10 reverse ){
      println(i)
    }
    //步长不能为0
    for (data <- 1.0 to 10.0 by 0.3 ){
      println(data) //精度缺失
    }

    //循环嵌套
    for (i <- 1 to 3){
      for (j <- i to 3){
        println("i=" + i + ", j=" + j)
      }
    }

  for (i <- 1 to 4; j <- 1 to 5){
    println("i=" + i + ", j=" + j)
  }
  //6.循环引入变量
    for (i <- 1 to 10){
      val j = 10 - i
      println("i=" + i + ", j=" + j)
    }

    for(i <- 1 to 10; j = 10 -1){
      println("i=" + i + ", j=" + j)
    }

    for {i <- 1 to 10;
        j = 10 - 1 }{
      println("i=" + i + ", j=" + j)
    }

    //7. 循环的返回值，默认返回值空
    val a: Unit = for (i <- 1 to 10) {
      i
    }
    println(a)

    val b: IndexedSeq[Int] = for (i <- 1 to 10) yield i * 2
    println(b)
    //直接对集合中的元素作用


    // 8. 循环中断






  }


}
