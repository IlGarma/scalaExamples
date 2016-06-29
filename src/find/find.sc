val MyList = List.tabulate(10)(_+1)
val found = MyList.find(_>3).map(_*3)
val found2 = MyList.find(_>100).map(_*3)
found.isDefined
found2.isDefined
found.isEmpty
found2.isEmpty