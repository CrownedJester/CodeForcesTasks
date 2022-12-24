fun main() {
    val worldsCount = readLine()!!.toInt()
    val resultList = mutableListOf<String>()
    repeat(worldsCount) {
        val word = readLine()!!
        resultList.add(if (word.isLongWord()) word.convert() else word)
    }

    resultList.forEach {
        println(it)
    }

}

fun String.isLongWord() = this.length > 10

fun String.convert() = this.first() + (this.length - 2).toString() + this.last()
