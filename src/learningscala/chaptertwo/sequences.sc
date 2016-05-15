val b = Array(1,2,3)
val a = List(1,2,3)

b(0)
b(1) = 4
b
//error a(1) = 2

1:: a
a

val c = Array.fill(10)(1)
val d = List.fill(10)(1)

val e = Array.tabulate(10)(i=>i+1)
val f = List.tabulate(10)(i=>i+1)

val g = Vector(1,2,3)
g(0)

import collection.mutable
val h = mutable.Buffer(1,2,4)

//Range
1 to 10
1 to 10 by 2

10 to -10 by -1

c.size
c.length
1 :: d

val (after, before) = (1,2)

val (after1,before1) = a.splitAt(2)

d.slice(2,5)

b.update(0,5)
b
val b1 = b.updated(0,-1)
b
b1

val d1 = d.patch(2, Array(-13,-2,-31), 0)
d

c.union(b)

c.diff(b).distinct

c.sum

c.mkString

c.mkString("[->",",","<-]")

b.zip(c)
b.zipWithIndex
