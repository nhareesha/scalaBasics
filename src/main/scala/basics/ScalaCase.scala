package basics

class ScalaCase {

  case class exampleCase(name: String)

  def sayHello(): exampleCase = {
    var objCaseClass = exampleCase("Hareesha") //  case class dosen't need new to
    objCaseClass
  }
}

object ScalaCase {
  def main(args: Array[String]): Unit = {
    println(new ScalaCase().sayHello().toString)
  }

}

