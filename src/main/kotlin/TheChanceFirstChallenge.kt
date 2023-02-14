//https://app.codesignal.com/challenge/JJfSLsWMTsFcqFEXS
object TheChanceFirstChallenge {
    fun solution(l: MutableList<String>): Double {
        if (l.size < 2) return -1.0
        var A = 0
        for (i in l) {
            if (i != "a" && i != "b") return -1.0
            if (i == "a") A++
        }
        return A.toDouble() / l.size
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

        *****************************************

        val A = l.count { it.toLowerCase() == "a" }
        val B = l.count { it.toLowerCase() == "b" }
        return when {
            A == 0 || B == 0 -> -1.0
            else -> A.toDouble() / l.size
        }

        *******************************
        return if (l.any { it.toLowerCase() != "a" && it.toLowerCase() != "b" } || l.size < 2) -1.0
        else l.count { it.toLowerCase() == "a" } / l.size.toDouble()


        //fun solution(s: List<*>)= if(s.toSet() == setOf("a" , "b")) s.count{it=="a"}*1F/s.size else -1
}*/