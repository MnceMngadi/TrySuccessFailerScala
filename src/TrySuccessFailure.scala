import scala.util.{Try,Success,Failure}
import java.io.{ByteArrayOutputStream,StringReader}
object TrySuccessFailure {


  def main(args: Array[String]): Unit = {

    parseInt("3")

  }

  def parseInt(a : String): Try[Int] = Try(a.toInt)

  parseInt("2") match {//prints an int if case is successful if not its prints the failure message

    case Success(o) => println(o)
    case Failure(b) => println(b.getMessage)

  }



}
