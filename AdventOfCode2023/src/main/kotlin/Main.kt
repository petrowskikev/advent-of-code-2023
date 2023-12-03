import java.io.File

fun main() {
    print(AOCFun2().cubeConundrum(File(ClassLoader.getSystemResource("input.txt").toURI()).readText()))
}