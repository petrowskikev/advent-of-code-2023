import java.io.File

fun main() {

    print(AOCFun().calibrationValue(File(ClassLoader.getSystemResource("input.txt").toURI()).readText()))
}