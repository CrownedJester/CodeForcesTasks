fun main() {
    val nk = readLine()!!.split(" ").map {
        it.toInt()
    }
    val scores = readLine()!!.split(" ").map {
        it.toInt()
    }

    print(
        scores.count {
            it >= scores[nk[1] - 1] && it != 0
        }
    )

    print(
        sumWithBlock(5, 4) { a, b ->
            print(a)
            print(b)

        }
    )
}

fun sumWithBlock(a: Int, b: Int, block: (Int, Int) -> Unit): Int {
    block(a, b)
    return a + b

}