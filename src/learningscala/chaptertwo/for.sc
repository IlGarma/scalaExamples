for (i <- 1 until 5) println(i)

for (i <- 1 to 5) println(i)

for (i <- 1 to 5) yield i

for (i <-1 to 5; j<-1 to 5) yield (i,j)

for (i<-1 to 5; j <-1 to 5; if i!=j) yield (i,j)

for {
  i<-1 until 5
  j<-1 until 5
  if (i!=j)
} yield (i,j)


var i=0
while (i<5) {
  println(i)
  i+=1
}