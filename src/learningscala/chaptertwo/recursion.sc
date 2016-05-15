def calculatePiGreco(n: Int) : Double = {
  def helper(accumulator: Double, add: Boolean, i: Int): Double= {
    //print("Iterazione " + i)
    val help: Double = 4.0/(i*(i+1)*(i+1+1))
    //print(", help" + help)
    val pigreco = if (add) accumulator + help else accumulator - help
    println("temp pigreco= " + pigreco)
    if (i == n) pigreco
    else helper(pigreco, !add, i+1)
  }

  helper(3, true, 2)
}

calculatePiGreco(10)

