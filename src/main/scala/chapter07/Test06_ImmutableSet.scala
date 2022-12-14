package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    //1. 创建set
    val set1 = Set(13, 23, 53, 12,13,23,78)
    println(set1)

    println("==================")
    // 2. 添加元素
    val set2 = set1.+(20)
    val set3 = set2 + 129
    println(set1)
    println(set2)
    println("=====================")

    // 3. 合并set
    val set4 = Set(19, 13,23,53,67, 99)
    val set5 = set3 ++ set4
    println(set5)

    // 4. 删除元素
    val set6 = set5 - 13
    println(set5)
    println(set6)
    println(set6)

  }

}
