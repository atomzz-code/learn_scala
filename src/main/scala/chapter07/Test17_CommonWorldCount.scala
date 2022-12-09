package chapter07

object Test17_CommonWorldCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )

    //1.对字符串按照空格进行拆分
    //val wordList1: List[Array[String]] = stringList.map(_.split(" "))
    //val wordList2 = wordList1.flatten
    //println(wordList2)

    val wordList = stringList.flatMap(_.split(" "))
    println(wordList)

    //2. 相同的单词进行分组
    val groupMap: Map[String,List[String]] = wordList.groupBy(word => word)
    println(groupMap)

    //3.对分组之后的list取长度， 得到每个单词的个数
    val countMap:Map[String,Int] = groupMap.map(kv => (kv._1,kv._2.length))

    //4.将MAP转换成LIST，排序取前三
    val sortList: List[(String,Int)] = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(sortList)


  }

}
