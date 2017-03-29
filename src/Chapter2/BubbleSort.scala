package Chapter2

import scala.annotation.tailrec

/**
  * Created by hadoop on 22/3/17.
  */
object BubbleSort {
  @tailrec
  def bubbleSort(array: Array[Int]): Array[Int] = {
    var didSwap = false
    for(i <- 0 until array.length - 1)
      if(array(i+1) < array(i)){
        array(i+1)=array(i)+array(i+1)
        array(i)=array(i+1)-array(i)
        array(i+1)=array(i+1)-array(i)

        didSwap = true
      }
    // Repeat until we don't have anymore swaps
    if(didSwap)
      bubbleSort(array)
    else
      array
  }
  def main(args: Array[String]): Unit = {
    var arr:Array[Int]=Array(12,3,8,2,90,1)
    bubbleSort(arr);
    arr.foreach(println);
  }

}
