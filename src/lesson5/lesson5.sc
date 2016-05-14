import scala.math

Array(1,2,3).map((x: Int) => x*x)

Array(1,2,3).map (x => x*x)

Array(1,2,3).map (_+4)

val f = (x :Double)  => 3+x
f(3)

def function4( x: (Double) => Double ) = x(0.25)

function4(math.ceil _)

def f2 (x: Double) = (y: Double) => x*y

val f4 = f2(3)
f4(5)

def p (x:Int) : Double = {
  x*x
}
p(9)



