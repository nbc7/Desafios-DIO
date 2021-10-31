fun main(args: Array<String>) {
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toDouble()
    var i = 0.0
    var d: Double
    
    if (r > 4500) {
        i = 1000 * 0.08 + 1500 * 0.18
        d = r - 4500
        i += d * 0.28
    } else if (r > 3000) {
        i = 1000 * 0.08
        d = r - 3000
        i += d * 0.18
    } else if (r > 2000) {
        d = r - 2000
        i = d * 0.08
    }
    
    if (i == 0.0) println("Isento") else println("R$ ${i.format(2)}")
    
    
}