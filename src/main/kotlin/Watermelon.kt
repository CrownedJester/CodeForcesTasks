fun main() {

    val waterMelonWeight = readLine()!!.toInt()

//    print(if(waterMelonWeight % 2 ==0 && waterMelonWeight != 2) "YES" else "NO")
    require(waterMelonWeight % 2 == 0) {
        "Watermelon has even weight"
    }

}