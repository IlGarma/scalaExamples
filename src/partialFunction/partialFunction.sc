val pf : PartialFunction[Any, String] = {
  case i:Int => "Integer"
  case s: String => "String"
  case _=>"Not match"
}

pf(5)
pf(5.0)
pf ("t")
