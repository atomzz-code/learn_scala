package chapter07
import scala.collection.mutable
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建set
    val set1: mutable.Set[Int] = mutable.Set(13,23,53,12,13,23,78)
    println(set1)

    println("============")

    // 2. 添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)

    set1 += 11
    println(set1)

    set1.add(10)
    println(set1)
    println("=====================")
    val flag1 = set1.add(10)
    println(flag1)
    println(set1)

    //3. 删除元素
    set1 -= 11
    println(set1)

    set1.remove(10)
    println(set1)
    println("=====================")
    val flag3 = set1.remove(10) //返回boolean类型
    println(flag3)
    println(set1)

    //4.合并两个set
    println("=====================")
    val set3 = mutable.Set(13,12,13,27,98,29)
    println(set1)
    println(set3)
    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)

    set1++=set3
    println(set1)

  }

}
