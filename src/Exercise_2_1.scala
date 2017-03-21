/**
Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
The first two Fibonacci numbers are 0 and 1 . The nth number is always the sum of the
previous two—the sequence begins 0, 1, 1, 2, 3, 5 . Your definition should use a
local tail-recursive function.
  def fib(n: Int): Int
  */

object Exercise_2_1 {

  def fib(n:Int):Int= {
    @annotation.tailrec  //tail recursion or not @annotation.tailrec chk this
    def fibonacci(i:Int,a:Int,b:Int):Int={
      if(i==n)  a;
      else
      fibonacci(i+1,b,a+b)    //tail call
    }
    fibonacci(0,0,1)
  }
/*
    no need to write return statement, compiler automatically put one if it is in the last line
 */

  def main(args: Array[String]): Unit = {
    println(fib(7))

  }

}
