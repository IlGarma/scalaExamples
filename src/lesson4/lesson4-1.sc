class Time(h: Int,  m:Int) {
  def this(h: Int) {
    this(h,0)
  }

  private var minuteFromMidNight = (h * 60) + m -1

  def hours = minuteFromMidNight / 24
  def minutes = minuteFromMidNight % 60

  def minutes_=(newMinutes:Int) {
    minuteFromMidNight = (hours * 60) + newMinutes -1
  }

  if (hours < 0 | hours > 23) throw new IllegalArgumentException
  if (minutes <0 | minutes > 60) throw new IllegalArgumentException

  override def toString() = f"(${hours}:${minutes})"

  def before(time: Time) : Boolean = {
    if (this.minuteFromMidNight < time.minuteFromMidNight) true
    else false
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
time3.minutes= 25

time3