//Map

val scores = Map("Lucas" -> 28, "John" -> 14)

scores("Lucas")

scores.getOrElse("Lucas", -1)

scores.getOrElse("Lucazzz", -1)

val scores2 = scores + ("Testa"->25)

scores2

for ((name, age) <- scores) println("name: " + name + ", age: " + age + ". ")


//Tuples
val t = ("Little", 24, true)
t._1
t._2

val (text, age, here) = t
val (_,_,here2) = t