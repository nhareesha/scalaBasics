package basics

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS

object ScalaFunctions {

  // Parameterised function with return type void
  def main(args: Array[String]): Unit = {
    paramFunctionWithoutEquals(10, 20)

    var c = paramFunctionWithEqualsAndReturnType(a = 10, b = 12) // parameters names can be passed from the calling function
    println("Value : " + c)

    var d = parmFunWithDefaultValues()
    println("Value of function with all default values is : "+d)

    var e = parmFunWithDefaultValues(a=100.0) //Here one passed value and other default value will be used
    println("Value of function with one default values is : "+e)

    var lengthOfArgs = funWithVariableArgs(1,2,3,4,5)
    println("Lenght of variable arguments : "+lengthOfArgs)

    // higher order function
    callByName(callee);

    //ANONYMOUS function
    var f = (x:Int,y:Int) => x+y
    println("Anonymous func value is : "+f(1,2))

    //Closures - value of clsFunc depends on valueOutSide
    var valueOutSide = 40
    var clsFunc = (x : Int) => x + valueOutSide
    println("Value of closure function is : "+clsFunc(10))

  }

  def paramFunctionWithoutEquals(a: Int, b: Int) { // Here by default return type is Unit
    var c = a + b
    println(c)
  }

  //  def paramFunctionWithoutEquals(a:Int,b:Int):Unit={
  //    var c = a+b
  //    println(c)
  //  }

  def paramFunctionWithEqualsAndReturnType(a: Int, b: Int): Int = {
    var c = a + b
    c // Last statement is considered as return type.No return key word
  }

  def parmFunWithDefaultValues(a: Double = 0.0, b: Double = 3.3): Double = { // function parameters with default values
    var c = a + b
    c
  }

  //Function with variable arguments.Here any number of integers can be passed
  def funWithVariableArgs(args:Int*):Int={
    for(a <- args){
      println(a)
    }
    args.length
  }

  def callByName(f:(Double,Double) => Any):Unit={
    var value = f(12.1,13.1)
    println("Value calculated from higher order function : "+value)
  }

  def callee(a:Double,b:Double):Any={
    a+b
  }

}
