class Person private (val name: String, val age: Option[Int]) {
  def this(name: String) = this(name, None)
}

object Person {
  def apply(name: String, age: Option[Int]): Person = new Person(name, age)

  def apply(name: String): Person = new Person(name, None)

  val tuple = ("this is" , "a tuple with value", 1 , 2 , 3)
  val twovalue = ("p", 1)

}

val test = Person("io", Some(23))
val test2 = Person("tu")

test.name
test.age
test2.name
test2.age

Person.tuple._1
Person.tuple._2
Person.tuple._3
Person.twovalue.swap