class Person(val name: String, val surname: String) {
  require(name.nonEmpty, "Name cannot be empty")
  require(surname.nonEmpty, "Surname cannot be empty")
}

class Department (val name: String)

class Manager (name: String, surname: String, val department: Department) extends
Person(name,surname)

val per = new Person("Test", "Pest")
per.name
per.surname


val dep = new Department("Lost department")
val manager = new Manager("Io", "Ty", dep)
manager.name
manager.surname
manager.department.name

def printName(person: Person) : Unit = {
  println(s"Person name: ${person.name}")
}

printName(per)
printName(manager)