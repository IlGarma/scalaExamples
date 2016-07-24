val a = Map((1,"Gio"), (2, "Oig"))

val b = Map(1->"Gio", 2->"Oig")

a.get(0)
a.get(1)
//a(0) NPE
a(1)
a.keys
a.values
a.values.toSet
a.values.toList

val c = Map('index0 -> "Test")

val symbol = Symbol("index0")
'index0 == symbol
'index0 eq symbol

val index12 = new String("index1")
val index12a = "index1" //interned
index12 == index12a
index12 eq index12a
c.get('index0)

