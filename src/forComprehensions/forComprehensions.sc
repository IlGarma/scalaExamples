for (i<- 1 to 10) println(i)

val a = for (i<-1 to 10) yield (i)
val b = for (i<-1 to 10 if i%2 ==0) yield (i)
val c = for (i<-1 to 10 if i%2==0; j<-1 to 10) yield (i,j)
val d = for (i<-1 to 10; j<-1 to 10 if j!=i) yield (i,j)

val a1 = 1 to 10
val b1 = (1 to 10).filter(x=>x%2==0)

val c1 = (1 to 10).filter(_%2==0).flatMap(j=>(1 to 10).map(i=>(i,j)))

val d1 = (1 to 10).flatMap(i=>(1 to 10).filter(j=>i!=j).map(j=>(i,j)))

val e1 = (1 to 10).withFilter(_%2==0).map(i=>i)