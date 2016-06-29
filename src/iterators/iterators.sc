val resource = scala.io.Source.fromFile("E:/remotePersonalRepo/scalaExamples/src/iterators/estrazionidellotto.csv")

val lines = resource.getLines()

lines.next
lines.next
lines.next
"".split(";")

case class FirstExstraion(date :String = "N/a", first: Int =0)

def extract (line: String): FirstExstraion = {
  val lineTemp = line.split(";").map(_.trim)
  if (lineTemp.length <2) FirstExstraion("N/A", 0)
  else FirstExstraion(lineTemp(0), lineTemp(1).toInt)
}

lines.map(extract).toArray
resource.close()

