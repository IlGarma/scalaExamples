val MyList = List(1,2,3)
val MyArray = Array(1,3,"pippo")

Array.fill(10)(3)
Array.fill(10)(Math.random())

List.tabulate(10)(i=>i) //index
Array.tabulate(10)(i=>i+2)


MyList.isEmpty
MyList.nonEmpty

MyList.last
MyList.head

1 :: MyList

MyList ++ List(2,3,4)

MyList.slice(1,2)

MyList.updated(0,-9)

MyList.patch(1, List(8,9,10,11), 0)

MyList.patch(2, List(9,99,9999), 1)

MyArray ++ Array(1,2,3,4,5)

MyArray.update(2, "pluto")
MyArray

var myArray2 = Array(4,5,6,7,8)
myArray2.exists(_>3)
myArray2.forall(_>0)
myArray2.forall(_<0)
myArray2.map(_+3)
myArray2.reduce(_+_)
myArray2.reduceLeft(_+_)
myArray2.foldLeft("La stringa è: ")(_+_)
myArray2.filter(_>6)
myArray2.take(0)
myArray2.take(1)
myArray2.take(2)
myArray2.take(3)

myArray2.flatMap(i=>myArray2.take(i))

myArray2.mkString
myArray2.mkString(",")
myArray2.mkString("[",",","]")