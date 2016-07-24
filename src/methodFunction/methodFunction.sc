class Method(x:Int) {
  def m(y:Int) = x+y
  def m1(f:Int => Int) = f(x)
  def j(z:Int, a: Int) = a+z
  def m2(f: (Int,Int)=>Int) = f(x,5)
}

val a = new Method(10)
a.m(5)
val f = a.m _
f(3)

val g = a.m1(f)
val g2 = a.m1(a.m _)
val g3 = a.m1(a.m)

val te = (x:Int)=>x+1
val te2:Function1[Int, Int] = new Function[Int,Int] {
  def apply(x:Int) = x+1
}
val te3= (x:Int) => x+1

val h1 = a.j(3, _:Int)
a.m1(h1)
val h2 = a.j _
a.m2(h2)

