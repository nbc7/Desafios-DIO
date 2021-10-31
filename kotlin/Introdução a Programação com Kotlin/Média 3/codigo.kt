import java.util.*
import kotlin.math.round

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val n1 = entrada.nextFloat()
    val n2 = entrada.nextFloat()
    val n3 = entrada.nextFloat()
    val n4 = entrada.nextFloat()

    var media = ((n1*2 + n2*3 + n3*4 + n4*1)/10).toFloat()
    var mediaParaPrint = media.round(1)
  println("Media: $mediaParaPrint")

    if (media >= 7) {
      println("Aluno aprovado.")
  } else {
    if (media < 5) {
      println("Aluno reprovado.")
    } 
    if (media >= 5.0 && media <= 6.9) {
      println("Aluno em exame.")
      val exame = entrada.nextFloat().toFloat()
      val exameParaPrint = exame.round(1)
      
      println("Nota do exame: $exameParaPrint")
      media = ((media + exame) / 2).toFloat()
      mediaParaPrint = media.round(1)
      if (media >= 5) {
          println("Aluno aprovado.")
      } else {
        println("Aluno reprovado")
      }
      println("Media final: $mediaParaPrint")
    }
  }
}

private fun Float.round(decimals: Int): Float {
  var multiplier = 1.0F
  repeat(decimals) { multiplier *= 10 }
  return round(this * multiplier) / multiplier
}