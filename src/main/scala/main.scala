// Exercise 1: Sum odd values using for loop
def sumListFor(list: List[Int]): Int = {
  var sum = 0
  for (x <- list) {
    if (x % 2 != 0) sum += x
  }
  sum
}

@main def test1(): Unit = {
  println("Exercise 1 → " + sumListFor(List(1, 2, 3, 4, 5))) // 9
}

  // Exercise 2: Sum odd values using recursion
  def sumListRec(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail =>
      (if (head % 2 != 0) head else 0) + sumListRec(tail)
  }

  @main def test2(): Unit = {
    println("Exercise 2 → " + sumListRec(List(1,2,3,4,5))) // 9
  }

  // Exercise 3: Connect strings with separator
  def connectStrings(listOfString: List[String], separator: String): String = {
    listOfString.mkString(separator)
  }

  @main def test3(): Unit = {
    println("Exercise 3 → " + connectStrings(List("Scala", "is", "fun"), " ")) // Scala is fun
  }

  // Exercise 4: Fibonacci number (recursive)
  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  @main def test4(): Unit = {
    println("Exercise 4 → " + fibonacci(7)) // 13
  }

  // Exercise 5: Multiply odd values using for loop
  def mListFor(list: List[Int]): Int = {
    var product = 1
    for (x <- list if x % 2 != 0) {
      product *= x
    }
    product
  }

  @main def test5(): Unit = {
    println("Exercise 5 → " + mListFor(List(1,2,3,4,5))) // 15
  }

  // Exercise 6: Multiply odd values using recursion
  def mListRec(list: List[Int]): Int = list match {
    case Nil => 1
    case head :: tail =>
      (if (head % 2 != 0) head else 1) * mListRec(tail)
  }

  @main def test6(): Unit = {
    println("Exercise 6 → " + mListRec(List(1,2,3,4,5))) // 15
  }

  // Exercise 7: Sum all values using for loop
  def sumListAll(list: List[Int]): Int = {
    var sum = 0
    for (x <- list) sum += x
    sum
  }

  @main def test7(): Unit = {
    println("Exercise 7 → " + sumListAll(List(1,2,3,4,5))) // 15
  }

  // Exercise 8: Sum even values using recursion
  def sumEvenRec(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail =>
      (if (head % 2 == 0) head else 0) + sumEvenRec(tail)
  }

  @main def test8(): Unit = {
    println("Exercise 8 → " + sumEvenRec(List(1,2,3,4,5,6))) // 12
  }

  // Exercise 9: Recursive function f(n)
  def f(n: Int): Int = {
    if (n <= 1) -2
    else (n - 1) * f(n - 1) + 3
  }

  @main def test9(): Unit = {
    println("Exercise 9:")
    println(s"f(1) = ${f(1)}") // -2
    println(s"f(2) = ${f(2)}") // 1
    println(s"f(3) = ${f(3)}") // 5
    println(s"f(4) = ${f(4)}") // 14
  }
