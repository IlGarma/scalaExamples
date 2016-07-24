val a = List(1,2,3,4,5)
a.filter(x=>x %2 ==0)
a.filterNot(_%2==0)
a.exists(_%2==0)

val b = Map(1->"john", 2->"snow", 3->"game", 4->"of", 5->"Thrones")

b.filterKeys(_>2)

b.filter(x=> x._1>2) //x is a tuple

Some(5).filter(_%2==0)
Some(5).filterNot(_%2==0)

