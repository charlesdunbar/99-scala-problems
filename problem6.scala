/*
Find out whether a list is a palindrome.
    
Example:

scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true

*/

object Palindrome {
    def main(args: Array[String]): Unit = {
        println(isPalindrome(List(1, 2, 3, 2, 1)))
    }

    def isPalindrome(list: List[Any]): Boolean = {
        if (list == list.reverse) {
            return true
        }
        return false
    }
}