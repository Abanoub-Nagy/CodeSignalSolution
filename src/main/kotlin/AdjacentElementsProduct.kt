import java.lang.Integer.MIN_VALUE

//https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m
object AdjacentElementsProduct {
    fun solution(inputArray: MutableList<Int>): Int {
        return (1 until inputArray.size).maxOfOrNull { inputArray[it - 1] * inputArray[it] } ?: 0
    }
/*    fun solution(a: List<Int>) = a.zipWithNext(Int::times).max()!!
    fun solution(a: MutableList<Int>) = (0..a.size - 2).maxOfOrNull { a[it] * a[it + 1] } ?: MIN_VALUE*/
}

fun main() {
    println(AdjacentElementsProduct.solution(mutableListOf(3, 6, -2, -5, 7, 3)))

    /*
        val values = listOf(1, 4, 9, 16, 25, 36)
        val deltas = values.zipWithNext { a, b -> b - a }

        println(deltas) // [3, 5, 7, 9, 11]

        val letters = ('a'..'f').toList()
        val pairs = letters.zipWithNext()

        println(letters) // [a, b, c, d, e, f]
        println(pairs) // [(a, b), (b, c), (c, d), (d, e), (e, f)]

     */
}

