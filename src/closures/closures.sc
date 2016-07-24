class Closures(a: String) {
  val c = "ciao"
  var c1 = "mutable"
  val a1 = (b: String) => a + b + c + c1


}

val z = new Closures("oi")
z.a1("the")
z.c1 = "new Ciao"
z.a1("the")