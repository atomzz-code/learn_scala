package chapter02

object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    val hello: String = ""
    val Hello123 = ""
    val _abc = 123

    /** 错误
     * val h-b = ""
     * val 123hello = ""
     */

    val -+/% = "hello"
    println(-+/%)

    val `if` = "if"
    println(`if`)
  }

}
