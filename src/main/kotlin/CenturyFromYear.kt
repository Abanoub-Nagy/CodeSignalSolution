object CenturyFromYear {
    fun solution(year: Int): Int {
       return (year+99) / 100
    }

}

fun main() {
println( CenturyFromYear.solution(2000))
}