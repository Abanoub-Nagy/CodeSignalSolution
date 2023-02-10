//https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
object CenturyFromYear {
    fun solution(year: Int): Int {
        return (year + 99) / 100
    }

}

fun main() {
    println(CenturyFromYear.solution(2000))
}