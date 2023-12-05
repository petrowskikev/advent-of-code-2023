class AOCFun4 {
    fun scratchcards(input2: String): Double{
        val gameN = input2.split("\n")
        var currentCard = 1
        var count = 0.0
        var countArr = IntArray(gameN.size){0}

        for(game in gameN){
            val values = game.split(":")
            val valuesSplit = values[1].split(" | ")
            val winNum = valuesSplit[0].split(" ")
            val myNum = valuesSplit[1].split(" ")

            for(num in winNum){
                for(num2 in myNum){
                    if(num.isNotEmpty() && num != " " && num2.isNotEmpty() && num2 != " "){
                            if (num.toDouble() == num2.toDouble()) countArr[currentCard + 1]++
                    }
                }
            }
            currentCard++
        }

        return count
    }

    /* fun doublePoint(points: Int): Double{
        if (points.equals(0)) return 0.0
        if (points.equals(1)) return 1.0

        val pointsToDouble = points - 1.0
        return Math.pow(2.0, pointsToDouble)
    } */
}