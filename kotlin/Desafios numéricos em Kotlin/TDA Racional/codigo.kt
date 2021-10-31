import java.util.Scanner

fun main(args: Array<String>) {
  var scan = Scanner(System.`in`)
  val n: Int
  var n1: Int
  var d1: Int
  var n2: Int
  var d2: Int
  var simp: Int = 0
  var nf: Int = 0
  var df: Int = 0
  var ns: Int = 0
  var ds: Int = 0
  var aux: String
  
  n = scan.nextInt()
  
  for (i in 1..n) {
    n1 = scan.nextInt()
    scan.next()
    d1 = scan.nextInt()
    aux = scan.next()
    n2 = scan.nextInt()
    scan.next()
    d2 = scan.nextInt()
    
    when (aux) {
      "+" -> {
        ns = (n1 * d2) + (n2 * d1)
        ds = (d1 * d2)
      }
      "-" -> {
        ns = (n1 * d2) - (n2 * d1)
        ds = (d1 * d2)
      }
      "*" -> {
        ns = (n1 * n2)
        ds = (d1 * d2)
      }
      "/" -> {
        ns = (n1 * d2)
        ds = (n2 * d1)
      }
    }
    
    fun mdc (a: Int, b: Int): Int {
      var r: Int
      var aa: Int = a
      var bb: Int = b
      
      while (bb != 0) {
        r = aa % bb
        aa = bb
        bb = r
      }
      
      if (aa < 0) {
       aa = aa * (-1)
      }
      return aa
    }
    
    nf = ns / mdc(ds, ns)
    df = ds / mdc(ds, ns)
    
    println("$ns/$ds = $nf/$df")
  }
}