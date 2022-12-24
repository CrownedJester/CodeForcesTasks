fun main() {
    val wiresAmount = readln().toInt()
    val oskalsOnWires = readln().split(" ").map { it.toInt() }.toMutableList()
    readln().toInt().also {
        repeat(it) {
            val (wire, oskal) = readln().split(" ").map { value -> value.toInt() - 1 }

            if (wire + 1 < wiresAmount) {
                oskalsOnWires[wire + 1] += oskalsOnWires[wire] - (oskal + 1)
            }

            if (wire - 1 >= 0) {
                oskalsOnWires[wire - 1] += kotlin.math.abs(1 - (oskal + 1))
            }

            oskalsOnWires[wire] = 0
        }
    }
    oskalsOnWires.forEach(::println)
}