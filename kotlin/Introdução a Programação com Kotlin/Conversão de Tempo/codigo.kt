import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val entrada: Int = scanner.nextInt()

    val horas: Int = entrada/3600
    val minutos: Int = (entrada%3600)/60
    val segundos: Int = (entrada%3600)%60
    
    println("${horas}:${minutos}:${segundos}")
}