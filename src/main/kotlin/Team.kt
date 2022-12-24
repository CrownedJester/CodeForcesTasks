fun main() {
    val taskCount = readLine()!!.toInt();

    var result = 0

    repeat(taskCount) {
        val meanings = readLine()!!.split(" ").map { it.toInt() }
        if(meanings.count { it == 1 } > 1) result++

    }

    print(result)
}