object Test {

  def byValue(x:Int, y:Int) = {
    println("into function")
    x+y
  }

  def byFunction(x:Int, y:()=>Int) = {
    println("into function")
    x+y()
  }

  def byName(x:Int, y: =>Int) = {
    println("into function")
    x+y
  }

  def y()={
    println ("in the parameter function")
    3
  }

  byValue(1,y())
  byFunction(1,()=>y())
  byName(1,y())


  def safeDivision(f: =>Int) : Option[Int]= {
    try {
      Some(f)
    } catch {
      case ae: ArithmeticException => None
    }
  }

  def g() = {
    100/5
  }

  def g1() = {
    100/0
  }
  safeDivision(g())
  safeDivision(g1())
}