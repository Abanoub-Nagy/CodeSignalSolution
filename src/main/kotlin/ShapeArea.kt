//https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ
object ShapeArea {
    fun shapeArea(n: Int): Int {

        return if (n == 1) 1 else n * 4 - 4 + shapeArea(n - 1)

    }
}

fun main() {
    println(ShapeArea.shapeArea(4))
}