object Time {
  def apply(h:Int, m:Int)= new Time(h,m)
}

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

Time(3,4)