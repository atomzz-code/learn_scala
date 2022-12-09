package chapter07

import scala.collection.mutable
import scala.collection.immutable.Queue
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 创建一个可变的队列
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    //入队列
    queue.enqueue("a","b","c")
    println(queue)
    queue.dequeue()
    println(queue)
    queue.dequeue()
    println(queue)

    queue.enqueue("d","e")
    println(queue)

    //不可变队列
    val queue2 = Queue("a","b","c")
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)


  }

}
