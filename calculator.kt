class Calculator(val name: String) {
  init {
    println("$name's Calculator 🧮")
  }

   //function add
  fun add(param1: Int, param2: Int): Int {
    print("$param1 + $param2 = ")
    return param1 + param2
  }
  
}

fun main() {

}