//https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ
object CheckPalindrome {
    fun solution(inputString: String): Boolean {
        var reverseInputString: String = inputString.reversed();
        return inputString.equals(reverseInputString, true)

    }
}

fun main() {
    println(CheckPalindrome.solution("aabaa"))
}