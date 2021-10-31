fun main() {
    val n = 1..(readLine() ?: return).toInt()
    for (i in n) {
      println("${i} ${ i * i } ${ i * i * i }")
      println("${i} ${ i * i + 1} ${ i * i * i + 1}")
    }
}