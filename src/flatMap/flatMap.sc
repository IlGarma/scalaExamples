val a = List(1,2,3)

a.map(x=>List(-x,0,x))

a.map(x=> List(-x,0,x)).flatten
a.flatMap(x=>List(-x,0,x))

val b = List(List(1,2), List(1,2))
b.flatMap(x=>x)
Some(4).map(x=>x+1)
Some(4).map(x=>Some(x+1))
Some(4).flatMap(x=>Some(x+1))
List(Some(1), Some(2), Some(3), None, Some(1), None).flatMap(x=>x)

Some(4).map(x=>x+1)

