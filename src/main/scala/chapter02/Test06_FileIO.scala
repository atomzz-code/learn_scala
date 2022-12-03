package chapter02
import java.io.{PrintWriter, File}
import scala.io.Source
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // read from file
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // write file
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from java writer")
    writer.close()
  }

}
