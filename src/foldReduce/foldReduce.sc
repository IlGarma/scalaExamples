val a  = 1 to 10
a.foldLeft(0)((sum:Int, element:Int) => {
  println(s"element $element sum $sum")
  element+sum
})

a.reduceLeft((sum:Int, element:Int) => {
  println(s"element $element sum $sum")
  sum + element
})

a.foldRight(0)((element:Int, sum:Int) => {
  println(s"element $element sum $sum")
  sum + element
})

a.reduceRight((element: Int, sum:Int) => {
  println(s"element $element sum $sum")
  sum + element
})

a.foldLeft(0)(_+_)
a.reduceLeft(_+_)
a.foldRight(0)(_+_)
a.reduceRight(_+_)