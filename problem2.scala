/*
Find the last but one element of a list.

Example:

scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
*/

object Penultimate { 
    def main(args: Array[String]): Unit = {
        println(penultimate(List(1, 1, 2, 3, 5, 8)))
    }

    def penultimate(obj: List[Any]): Any = {
        obj(obj.length-2)
    }
}