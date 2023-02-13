//https://app.codesignal.com/challenge/JJfSLsWMTsFcqFEXS
object TheChanceFirstChallenge {
    fun solution(l: MutableList<String>): Double {
        if (l.size < 2) return -1.0
        var countA = 0
        for (element in l) {
            if (element != "a" && element != "b") return -1.0
            if (element == "a") countA++
        }
        return countA.toDouble() / l.size
    }

}

fun main() {
    println(
        TheChanceFirstChallenge.solution(
            mutableListOf(
                "a",
                "b",
                "b"
            )
        )
    )
}

//fun solution(s: List<*>)= if(s.toSet() == setOf("a" , "b")) s.count{it=="a"}*1F/s.size else -1
/*fun solution(l: MutableList<String>): Double {
        var A = 0
        var B = 0
        for (i in l) when (i) {
            "a" -> A++
            "b" -> B++
        }
        if (A != 0 && B != 0 && !l.any { it != "a" && it != "b" }) {
            return A.toDouble() / l.size.toDouble()
        }
        return -1.0
}*/