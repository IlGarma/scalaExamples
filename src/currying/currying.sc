object Currying {

  val f: Int => (Int => Int)  = (x:Int) => (y:Int) => x + y
  f(3)(2)

  val f2: (Int, Int) => Int = (x:Int, y: Int) => x+y

  val f0 = () => 3
  f0
  f2.curried

  val f2s: (Int, Int) => Int = (x:Int , y: Int) => x+y


  val g: Int=> (Int=>Int) = (x:Int)=> (y:Int) => x+y
  val g2: (Int, Int)=>Int = (x:Int, y:Int)=>x+y

  val z = (x:Int, y:Int) => x*y

  val z2 = (x:Int)=>(y:Int)=>y + x

  val gg = (x:Int)=> (z:Int=>Int) => z(x)
  gg(3)(m=>m+1)
  gg(3)(1+_)
  z.curried


  def p(x:Int, y:Int, z:Int) = x+y+z
  def p2 (x:Int)(y:Int)(z:Int) = x+y+z

  val pg = p(3,_:Int,_:Int)
  pg(4,5)
  val pg2 = p2(3) _
  pg2(4)(5)


}