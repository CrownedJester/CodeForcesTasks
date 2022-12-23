fun main() {
    var countOfOne = 0
    var countOfTwo = 0
    var countOfThree = 0
    readln().forEach {
        when (it) {
            '1' -> countOfOne++
            '2' -> countOfTwo++
            '3' -> countOfThree++
        }
    }

    StringBuilder().apply{
        repeat(countOfOne){
            append("1+")
        }
        repeat(countOfTwo){
            append("2+")
        }
        repeat(countOfThree){
            append("3+")
        }

        deleteAt(this.lastIndex)
        print(this)
    }
}