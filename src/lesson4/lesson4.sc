class Time(var hour: Int = 0, val sec: Int = 0) {
  def this(h: Int) {
    this(h, 0)
  }
  if (hour < 0 | hour > 23) throw new IllegalArgumentException
  if (sec <0 | sec > 60) throw new IllegalArgumentException

  override def toString() = f"(${hour}:${sec})"

  def before(time: Time) : Boolean = {
    var isBefore = false
    if (this.hour < time.hour) isBefore = true
    else if (this.hour == time.hour && this.sec < time.sec)
      isBefore = true
    isBefore
  }

}

new Time(1,58)
//new Time(-1,20)
//new Time(1,61)

val time = new Time(1,22)
val time2 = new Time(2,20)

time.before(time2)
time2 before time

val time3 = new Time(3)
val time4 = new Time()
time.hour = 21