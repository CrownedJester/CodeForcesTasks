import kotlin.math.abs

private const val MATRIX_SIZE = 5
private const val MATRIX_CENTER = 3
fun main() {

    (1..MATRIX_SIZE).forEach { row ->
        readln()
            .split(" ")
            .forEachIndexed { col, value ->
                if (value.toInt() == 1) {
                    println(
                        abs(MATRIX_CENTER - row)
                                + abs(MATRIX_CENTER - (col + 1))
                    )
                    return@forEach
                }
            }
    }


}