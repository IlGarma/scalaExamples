val a = List("Game", "of", "Thrones", "Stark", "Lannister", "Targaryen")

a.zipWithIndex.map(t => (t._2,t._1)).map(t=>(t._1+1, t._2)).map(t=> s"${t._1} ${t._2}")
.mkString("\n")