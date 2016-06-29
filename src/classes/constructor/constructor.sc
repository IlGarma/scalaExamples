class PersonThree(val name: String, val surname: String, val age: Int) {
  def this(name:String, surname: String) = this(name, surname, 18)
  def this(name: String) = this(name, "Default")
}

val p1 = new PersonThree("Gio", "Test", 15)
p1.surname
p1.name
p1.age
val p2 = new PersonThree("Gio1", "Test1")
p2.name
p2.surname
p2.age
val p3 = new PersonThree("Gio2")
p3.name
p3.surname
p3.age

class PersonTest(val name:String, val surname: String, val age: Int = 18)

val p4 = new PersonTest("Gio", "Test", 22)
p4.name
p4.surname
p4.age
val p5 = new PersonTest("Gio2", "Test2")
p5.name
p5.surname
p5.age
val p6 = new PersonTest(surname = "Test4", name = "Muhaha")
p6.name
p6.surname
p6.age

class PersoneRequire (val name: String, val surname: String) {
  require(name.nonEmpty, "Name cannot be empty")
  println(surname.length)
  require(surname.size<5, "The surname must be set")
  if (surname.contains("Mr")) {
    throw new IllegalArgumentException("Cannot use Mr")
  }
}

//val pr = new PersoneRequire("Peppe", "thridsa")
//
//val pr2 = new PersoneRequire("sfhjshfj", "sdkjskdjkjsk")
//
//val pr3 = new PersoneRequire("Ol", "nn")

try {
  val pr4 = new PersoneRequire("p", "Mr TestMuhaha")
} catch {
  case ex:IllegalArgumentException => println(s"Exception found ${ex.getMessage}")
} finally {
  println("Ending....")
}