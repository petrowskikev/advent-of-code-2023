class AOCFun2 {
    fun cubeConundrum(givenString: String): Int{
        val gamesArray = givenString.split("\n")
        var count = 0

        for(game in gamesArray){
            count += gameCount(game)
        }

        return count
    }

    private fun gameCount(game: String): Int {
        val gameValues = game.split(":")

        val gameId = gameValues[0].split(" ")[1].toInt()

        val grabs = gameValues[1].split(";")

        var blue = 0
        var green = 0
        var red = 0

        for(oneGrab in grabs){
            val arrayOfColors = oneGrabValue(oneGrab)

            if (arrayOfColors[0] > blue) blue = arrayOfColors[0]
            if (arrayOfColors[1] > green) green = arrayOfColors[1]
            if (arrayOfColors[2] > red) red = arrayOfColors[2]
        }

        return blue * green * red
    }

    private fun oneGrabValue(grabString: String): Array<Int> {
        val valueSplit = grabString.split(",")

        var blueValue = 0
        var greenValue = 0
        var redValue = 0

        for (value in valueSplit) {
            if (value.contains("blue") && value.split(" ")[1].toInt() > blueValue) blueValue =
                value.split(" ")[1].toInt()
            else if (value.contains("green") && value.split(" ")[1].toInt() > greenValue) greenValue =
                value.split(" ")[1].toInt()
            else if (value.contains("red") && value.split(" ")[1].toInt() > redValue) redValue =
                value.split(" ")[1].toInt()
        }

        return arrayOf(blueValue, greenValue, redValue)
    }
}