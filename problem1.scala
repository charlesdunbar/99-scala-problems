/*
Find the last element of a list.

    Example:

    scala> last(List(1, 1, 2, 3, 5, 8)) res0: Int = 8
*/

object Last {
    def main(args: Array[String]): Unit = {
        println(last(List(1, 1, 2, 3, 5, 8)))
    }

    def last(obj: List[Any]): Any = {
        obj(obj.length - 1)
    }
}

