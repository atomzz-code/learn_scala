package chapter07

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[(String,Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala",3),
      ("hello spark from scala",1),
      ("hello flink from scala",2)
    )
    //思路一： 直接展开为普通版本
    val newStringList = stringList.map(
      kv => {
        (kv._1.trim + " " )* kv._2
      }
    )
    println(newStringList)

    // 接下来操作与普通版本完全一致
    val wordCountList = newStringList
      .flatMap(_.split(" ")) //空格分词
      .groupBy(word => word)  //按照单词分组
      .map(kv=>(kv._1,kv._2.length)) //统计出每个单词的个数
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(wordCountList)

    println("==============================================")
  //思路二：直接基于预统计的结果进行转换
    //1. 将字符串打散为单词，并结合对应的个数包装成二元组
    val preCountList= stringList.flatMap(
      tuple=>{
        val strings:Array[String]= tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }

    )
    println(preCountList)
    //2. 对二元组按照单词进行分组
    val preCountMap = preCountList.groupBy(_._1)
    println(preCountMap)
    val countMap = preCountMap.mapValues(tupleList => tupleList.map(_._2).sum)
    println(countMap)
    //4.转换成list排序取3
    val countList = countMap.toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(countList)








  }
}
