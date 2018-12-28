package basics

object ScalaDataStructures {

  val mapVal = Map("Key1" -> "Value1", "Key2" -> "Value2", "Key3" -> "value3")

  def main(args: Array[String]): Unit = {
    println(mapVal("Key1"))

    println(scala.util.Try(mapVal("Key5")).getOrElse("Unkown"))

    //Exception Handling
    try
      mapVal("Key10")
    catch {
      case e: Exception => println(e.getMessage)
      case _: Throwable => {
        println("Unknown Exception")
      }
    } finally {
      println("From Finally block")
    }

  }
}

