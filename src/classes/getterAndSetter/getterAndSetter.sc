class Person (val name: String, var surname: String)

val gio = new Person("Gio", "Sur")
gio.name
gio.surname = "Oi"

import beans.BeanProperty
class PersonJava(@BeanProperty val name: String, @BeanProperty var surname: String)
val gioJava = new PersonJava("TestJava", "SurJava")
gioJava.name
gioJava.getName

gioJava.surname = "SurJava2"
gioJava.getSurname
gioJava.setSurname("SurJava3")
gioJava.surname