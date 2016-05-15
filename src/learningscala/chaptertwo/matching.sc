
val a = 1 :: 2 :: 4 ::Nil

val Array(b,c) = "io,due".split(",")
val (d,e) = (1,2)

a.find(_>3) match {
  case None => "Non trovato"
  case Some(i) => "Questo " + i
}

def lenghtList(list : List[String]) : Int = {
  list match {
    case Nil => 0
    case h::t => 1 + lenghtList(t)
  }
}

lenghtList("1"::"2"::Nil)

