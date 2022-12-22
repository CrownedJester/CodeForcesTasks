fun main() {
    val (m, n) = readln()
        .split(" ")
        .map {
            it.toInt()
        }

    print(m * n / 2)
}