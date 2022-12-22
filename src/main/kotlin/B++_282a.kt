fun main() {
    val operationCount = readln().toInt()
    var x = 0
    repeat(operationCount) {
        x = doOperation(x, readln())
    }
    print(x)
}

private fun doOperation(value: Int, operation: String): Int {
    var result = value
    for (c in operation) {
        if (c == '+') {
            result++
            break
        } else if (c == '-') {
            result--
            break
        }
    }

    return result

}