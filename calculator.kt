class Calculator(val name: String) {
  init {
    println("$name's Calculator 🧮")
  }

   //function add
  fun add(param1: Int, param2: Int): Int {
    print("$param1 + $param2 = ")
    return param1 + param2
  }

  //function substract
  fun substract(param1: Int, param2: Int): Int {
    print("$param1 - $param2 = ")
    return param1 - param2
  }

  //function multiplication
  fun multiply(param1: Int, param2: Int): Int {
    print("$param1 * $param2 = ")
    return param1 * param2
  }

  //function division
  fun divide(param1: Int, param2: Int): Any {
    if (param2 == 0){
      return "Error. You can't divide by 0."
    } else {
      print("$param1 / $param2 = ")
      return param1 / param2
    }
  }

  //function power
  fun power(param1: Int, param2: Int): Int {
    var result = 1
    for (i in 1..param2){
      result *= param1
    }
    print("$param1 ^ $param2 = ")
    return result
  }

  fun percentage(param1: Int, param2: Int): Any{
    var decimalForm = param1 * 0.01
    print("$param1% of $param2 = ")
    return decimalForm * param2
  }
}

fun main() {

  val myCalculator = Calculator("Lais")
  println(myCalculator.add(5,7))
  println(myCalculator.substract(-1, 7))
  println(myCalculator.multiply(-2, 48))
  println(myCalculator.divide(70, 5))
  println(myCalculator.power(2, 3))
  println(myCalculator.percentage(50, 20))

}