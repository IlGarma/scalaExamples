object function {

  val f:Function1[Int,Int] = new Function[Int,Int] {
    def apply(x:Int) = x+1
  }

  f.apply(2)

  val f0: Function0[Int] = new Function0[Int] {
    def apply() = 1
  }

  val f2 : Function2[String, String, String] = new Function2[String, String, String] {
    def apply(x:String, y: String) = x+y
  }

  f0.apply()
  f2.apply("mu","hahah")


  val f1a: (Int => Int) = new Function[Int, Int] {
    def apply(x:Int) = x+1
  }


  val f1c: (Int => Int) = (x:Int) => x+1

  val f1d = (x:Int) => x+1

  val f2z = (x:Int, y:Int) => x + y

  val ft : String => (String, Int) = (x:String) => (x, x.size)
  println(ft("peppe"))

  val ft2 = (x:String)=> (x, x.size)
  ft2("peppe")

  val ft4 = (x:String) => (x,x+"haaha",x.size)
ft4("mu")
}
