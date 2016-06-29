object Test {

  val textToParse =
    """Hi, how old are you?
      |I'm 16
      |Hi, how old are you?
      |I'm 18
      |Hi, how old are you?
      |I'm 19
    """.stripMargin
  val pattern = """(\d)+""".r

  for (m <- pattern.findAllMatchIn(textToParse)) {
    println("Age: " + m)
  }


  val estrazioneNapoli = io.Source.fromFile("lotto-estrazione-singola.txt")

  val pattern2 = """Napoli\s*(\d+)\s+(\d+)\s+(\d+)\s+(\d+)\s+(\d+)\s+""".r

  for (pattern2(primo,secondo,terzo,quarto,quinto) <- estrazioneNapoli.getLines()) {
    println(primo)
    println(secondo)
    println(terzo)
    println(quarto)
    println(quinto)
  }


}
