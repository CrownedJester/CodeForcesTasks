import java.util.*

fun main() {
    val firstString = readln().lowercase(Locale.getDefault())
    val secondString = readln().lowercase(Locale.getDefault())

    print(
        if (firstString > secondString)
            1
        else if (firstString < secondString)
            -1
        else
            0
    )

}