//https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC
object MakeArrayConsecutive2 {
    /*sorting the list ascending
//since it's sorted so the minimum number will be the first in the list
//the maximum number will be the last in the list
//using the equation (max value - min value )+1 - the length of the list*/
    fun solution(statues: MutableList<Int>): Int {
        statues.sort();
        val minValue = statues[0];
        val maxValue = statues[statues.size.minus(1)]
        return ((maxValue - minValue) + 1) - statues.size
    }
}

fun main() {
    println(MakeArrayConsecutive2.solution(mutableListOf(6, 2, 3, 8)))
}
/*fun solution(statues: MutableList<Int>): Int {
    return (statues.max()!! - statues.min()!! - statues.size) + 1;
}
fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    val min = statues.first()
    val max = statues.last()
    var result: Int = 0
    (min..max).forEach { i ->
        when {
            !statues.contains(i) -> result++
        }
    }
    return result
}*/