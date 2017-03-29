package Chapter2

/**
Implement isSorted , which checks whether an Array[A] is sorted according to a
given comparison function:
def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean
  */
object Exercise_2_2 {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean={
    var inOrder = false
    for(i <- 0 until as.length - 1)
      if(ordered(as(i),as(i+1)))  inOrder=true   //it has to find any false till the end; that's why it stores the value
      else return false;                    //only one false ends the loop
    return inOrder
  }

  def main(args: Array[String]): Unit = {
    //val arr:Array[Int]=Array(12,3,8,2,90,1)
    // val arr:Array[Int]=Array(1,2,3,8,12,90)
    val arr:Array[Int]=Array(12,8,5,2,1)
    println(isSorted(arr,(x:Int,y:Int)=>x>y)); //anonymous function that checks the descending order;
    println(isSorted(arr,(x:Int,y:Int)=>x<y)); //anonymous function that checks the ascending order;

    //with existing functions; though not required for this particular problem
    println(isSorted(arr,ascendingOrdered));
    println(isSorted(arr,descendingOrder(_,_)));
  }
  def ascendingOrdered(a:Int,b:Int):Boolean=  a<b
  def descendingOrder(a:Int,b:Int):Boolean= a>b
}
