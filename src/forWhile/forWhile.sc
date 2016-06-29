var i=0

while (i<5) {
  println(i)
  i+=1
}

for (i <-0 until 5) {
  println(i)
}

for (i <-0 to 5) {
  println(i)
}

0 until 5
0 to 5

for (i<-0 until 5) yield i*i

var MyVe = 0 until 5

MyVe.map(i=>i*i)

val test = Array.fill(5)(Math.random)

test.map(_+1)

for (i<-0 to 5;j<- 1 to 6; if i%2 ==0) yield (i,j)

for {
  z<-0 to 5
  k<-0 to 5
  if k==z
  a=z*k
} yield (a,k+z)


var MyMap = Map(0->0)

(0 to 5).map(i=>i->i).toMap



