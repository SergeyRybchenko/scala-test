package Fibonacci

import scala.annotation.tailrec

object fibonacciFunc extends App {

  def fibonacciLoop(n: Int): Int = {
    var first:Int = 0
    var second:Int = 1
    var count:Int = 0

    while(count < n){
      val sum = first + second
      first = second
      second = sum
      count = count + 1
    }
    return first
  }

  def fibonacciRec(n:Int): Int = {
    if (n <= 2) 1
    else fibonacciRec(n - 1) + fibonacciRec(n - 2)
    }


  def fibonacciTailRec(n:Int): Int = {
    @tailrec
    def loop(n:Int, n0:Int = 0, n1:Int = 1): Int = {
      if (n == 0) n0
      else loop(n-1, n1, n0+n1)
    }
    loop(n)
  }


println(fibonacciTailRec(10))

}