import fastExponentiation.FastExponentiation
import stringOperations._
import stringOperations.examples.StreamsExamples
import stringOperations.operations.{FastExp, Sqrt}
import stringOperations.utils._

/**
  * Created by Robert-PC on 9/21/2017.
  */
object Main extends App with OperationFactory with StreamsExamples{

  def time[R](block: => R, sortingMethod: String): R = {
    val t0 = System.currentTimeMillis()
    val result = block // call-by-name
    val t1 = System.currentTimeMillis()
    println(s"Elapsed time on $sortingMethod: " + (t1 - t0) + "ms")
    result
  }

  println(compute(Root, Some(Pos("5"))))
  //println(FastExponentiation.computePowers(2, FastExponentiation.toBits(100)))
  //println(time(FastExp("2", "2000"), "Fast boiii"))
  //println(time(compute(Some(Pos("2")), Pow, Some(Pos("2000"))), " Fasttt"))
}
