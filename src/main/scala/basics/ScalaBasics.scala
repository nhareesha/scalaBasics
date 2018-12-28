package basics

object ScalaBasics {

  // public static void --> def
  // (String args[]) --> args: Array[String]
  // return type is Unit --> void
  def main(args: Array[String]): Unit = {

    var myvar1 : Int = 20 // mutable variable

    var myvar2 = "String variable" // here type String is inferred

    val myval1 : Int = 21 //immutable value or constant.This cannot be reassigned

   // myval1 = 23 // error

    val myval2: String = "Hello" // immutable value, and type is inferred

    val multiLineStr =
      """ hello
        |this
        |is multi line
        |String
      """.stripMargin

    println(myvar1);println(myvar2);println(myval1);println(myval2)
    println(multiLineStr)

    // While loop , do While loop and if else constructs are same as Java

    // There are difference variations of FOR loop in scala

    // 1. For loop with RANGE

    for( x <- 1 to 10){ // Here Range is 1 to 10
      print(x +"\t")
    }

    for(x <- 20 until 30 by 2){ // Range is 20 until 30 and increments by 2
      print(x+"\t")
    }

    println("\n"+"Iteration over list")

    var list = List("Hello",1,2,3) // Heterogenous collection of elements in List

    for(x <- list){ //iterating the list
        print(x+"\t")
    }

    // For loop with FILTERING example
    println("\n"+"Iteration over list with filtering condition")
    for(a <- 1 to 40 if a%10 == 4){
      print(a+"\t")
    }

    // For loop with YIELD keyword
    println("\n"+"Iteration over list with FILTERING CONDITION and YIELD")
    var forWithYieldA = for(a <- 1 to 40 if a%2==0)yield a
    for(x <- forWithYieldA)
      print(x+"\t")
  }

  // Creating Arrays
  println("Array values")
  var arr1:Array[String] = Array("Hello","Hi","Hareesha")
  for(arr <- arr1){
    print(arr+"\t")
  }

  // List - String
  var list1 : List[String] = List("Spark","Cassandra","Java","Scala","Kafka")

  // List - Empty list
  var list2 : List[Nothing] = List()

  // Set is immutable
  var s:Set[Int] = Set(1,2,3,4)


}
