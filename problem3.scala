/*
Find the Kth element of a list.

    By convention, the first element in the list is element 0.

    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2

*/

object Nth {
    def main(args: Array[String]): Unit = {
        println(nth(2, List(1, 1, 2, 3, 5, 8)))    
    }

    def nth(element: Int, obj: List[Any]): Any = {
        obj(element)
    }
}
