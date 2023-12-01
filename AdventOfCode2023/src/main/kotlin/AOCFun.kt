class AOCFun {
    private val numberPairs = arrayOf(Pair("one", 1), Pair("two", 2), Pair("three", 3), Pair("four", 4), Pair("five", 5), Pair("six", 6), Pair("seven", 7), Pair("eight", 8), Pair("nine", 9) )

    fun calibrationValue(cv: String): Int{
        val allLinesArr = cv.split("\n")
        var result = 0

        for(line in allLinesArr){
            result +=firstDigitOfString(line)
            result += lastDigitOfString(line)
        }

        return result
    }

    private fun firstDigitOfString(givenString: String): Int{
        var numberString = ""

        for(char in givenString){
            if (char.isDigit()){
                return char.toString().toInt() * 10
            } else {
                numberString += char.toString()

                if (numberString.length > 2){
                    for (pair in numberPairs) {
                        if (numberString.contains(pair.first)) return pair.second * 10
                    }
                }
            }

        }

        return 0
    }

    private fun lastDigitOfString(givenString: String): Int{
        var numberString = ""

        for(i in givenString.length - 1 downTo 0){
            if (givenString[i].isDigit()){
                return givenString[i].toString().toInt()
            } else {
                numberString = givenString[i] + numberString

                if(numberString.length > 2) {
                    for(pair in numberPairs){
                        if (numberString.contains(pair.first)) return pair.second
                    }
                }
            }
        }

        return 0
    }

}