var array = new Array[Int](10)

for (i<-0 until array.length) array(i) = i
array

import scala.collection.mutable.ArrayBuffer

var buffer = new ArrayBuffer[Int]
buffer+= 1
buffer+= (1,4,6)
buffer ++= Array(90,99,1010)

buffer.insert(1,17)
buffer

buffer.remove(1)
buffer

buffer.trimEnd(2)
buffer

buffer.trimStart(2)
buffer