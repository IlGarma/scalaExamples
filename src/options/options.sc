class Person(val name: String, val surname : Option[String]) {
  def this(name: String) = this(name, None)
}

val gio = new Person("jhon", None)

gio.name
gio.surname.getOrElse("unknown")

val gio2 = new Person("namePers")
gio2.name
gio2.surname

object Person {
  def apply(name: String) = new Person(name, None)
  def getSurname (name: Option[String]) : String = {
    name match {
      case Some(x) => x
      case None => "unknown"
    }
  }
}

val gio3 = Person("john2")
val gioFull = new Person("gio", Some("full"))
gio3.name
gio3.surname.getOrElse("unknown")
Person.getSurname(gio3.surname)
Person.getSurname(gioFull.surname)



val name = gio3.surname match {
  case Some(x) => x
  case _ => "unknonw"
}

val test = Some("test")
test.get


