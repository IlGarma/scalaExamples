object Test {

  val g:(Int => (Int =>Int)) = (x:Int) => (y:Int) => x+y
  g(2)(3)

  val a: (Int, Int=>Int)=>Int= (x:Int, y:Int=>Int) => y(x)

  a(1, m=>3+m)

  val c:(Int, Int)=>Int = (x:Int, y:Int)=>x+y

  val g2:Int=>(Int=>Int) = (x:Int) => (y:Int) => y + x

  val d:(Int, Int=>Int) =>Int = (x:Int, y:Int=> Int) => y(x)

  d(3, a=>a+1)
  d(3, _+1)
  d(3, 1+_)
  d(3,1+)
}