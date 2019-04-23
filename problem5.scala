/*
Reverse a list.

Example: 
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)

*/

import scala.collection.mutable.ListBuffer

object Reverse {
    def main(args: Array[String]): Unit = {
        println(reverse(List(1, 1, 2, 3, 5, 8)))
    }

    def reverse(obj: List[Any]): List[Any] = { 
        // Could just `obj.reverse`, but let's manually do work
        var retVal = new ListBuffer[Any]
        for(item <- obj) item +=: retVal // +=: is prepend syntax
        retVal.toList
    }
}
