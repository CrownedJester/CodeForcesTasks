fun main() {
    val inputData = readln()
        .split(" ")
        .map {
            it.toInt()
        }

    val dominoField = initDominoField(inputData[0], inputData[1])
    print(countPossibilities(dominoField))
}

private fun initDominoField(row: Int, col: Int): Array<Array<Int>> =
    Array(row) { Array(col) { 0 } }

private fun countPossibilities(matrix: Array<Array<Int>>): Int {
    var count = 0
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            if (j != matrix[0].indices.last && matrix[i][j] == 0 && matrix[i][j + 1] == 0) {
                matrix[i][j] = 1
                matrix[i][j + 1] = 1
                count++

            } else if (i != matrix.indices.last && matrix[i][j] == 0 && matrix[i + 1][j] == 0) {
                matrix[i][j] = 1
                matrix[i + 1][j] = 1
                count++
            } else {
                continue
            }
        }
    }

    return count
}