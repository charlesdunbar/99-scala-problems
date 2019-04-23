/*
Find the number of elements of a list.

Example:

scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6

*/

object Length {
    def main(args: Array[String]): Unit = {
        println(length(List(1, 1, 2, 3, 5, 8)))
    }

    def length(obj: List[Any]): Any = {
        // Could return obj.length, but let's not use the built-in
        var count = 0
        for(item <- obj) count += 1
        count
    }
}