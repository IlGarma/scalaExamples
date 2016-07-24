val a = Array(1,2,3,4,5)
a.head
a.tail
a.init
a.last
a.isEmpty
a.nonEmpty
a(1)
//a(100)

def format(s:String, i: Int, z:Any*): Unit = {
  println(s"inner function $z")
 println( ("%s %d random element %s").format(s, i, z.mkString(",")))
}

format("test", 12, 900)
format("test", 12, 900, 9001)

format("test", 12, Array(1,2,3,4))
format("test", 12, Array(1,2,3,4):_*)

