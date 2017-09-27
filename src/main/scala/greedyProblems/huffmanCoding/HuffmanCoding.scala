package greedyProblems.huffmanCoding

/**
  * Created by Robert-PC on 9/21/2017.
  */
object HuffmanCoding {

  def getFrequency(input: String): scala.collection.mutable.Map[Char, Int] = {
    var frequency = scala.collection.mutable.Map[Char, Int]()

    input.foreach(c =>
    if(frequency.contains(c))
      frequency(c) = frequency.getOrElse(c, 0) + 1
    else
      frequency += (c -> 1)
    )

    frequency
  }

  def getChars(input: Tree): List[Char] = {
    input match {
      case Fork(_, cs, _, _) => cs
      case LeafNode(c, _)    => List(c)
    }
  }

  def getWeight(input: Tree): Int ={
    input match {
      case Fork(_, _, ws, _) => ws
      case LeafNode(_, w)    => w
    }
  }

}