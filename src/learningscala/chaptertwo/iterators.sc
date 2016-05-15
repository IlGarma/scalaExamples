import java.io.File

new File(".").getAbsolutePath

val source = io.Source.fromFile("...AL013511_3888.csv")

val lines = source.getLines()

case class Line(state: String, cprecip: Double)
val terst : Double = 1.22
def parseLine(line: String): Line = {
  val temp = line.split(",").map(_.trim);

  val prec = if (temp(3) !="." && temp(3).forall(i => i.isDigit || i=='.' )) temp(3).toDouble else 1.00
  Line(temp(0), prec);
}

lines.next()
lines.next()
val data = lines.map(parseLine(_)).toArray

println("Max precipitazione " + data.map(_.cprecip).max)

source.close()