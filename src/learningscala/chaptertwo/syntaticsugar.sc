def bar(i: Int):Unit=  8


bar{
  print("ciao")
  8
}

def mywhile(cond: => Boolean)(body: => Unit): Unit = {
  if (cond) {
    body
    mywhile(cond)(body)
  }
}

var i=0;
mywhile(i<5) {
  println("ciao")
  i+=1
}
