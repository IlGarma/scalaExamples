val a = List(1,2,3,4,5)
val b = 1 :: 2 :: 3 :: Nil

val f = (x:Int) => x+1
val f1 : Int => Int = (x:Int)=>x+1
f1(3)
f(3)

b.map(f)
b.map(f1)
b.map(x=>x+1)
b.map(_+1)
b.map(1+_)
b.map(1+)

a.map(x=> (x, x+1))
Some(4).map(1+)
None.asInstanceOf[Option[Int]].map(1+)

val c = Set("john", "snow", "house", "stark")

c.map(x=>("Game of Thrones: ", x))