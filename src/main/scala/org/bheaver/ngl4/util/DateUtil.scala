package org.bheaver.ngl4.util
import com.github.nscala_time.time.Imports._
import org.joda.time
import org.joda.time.DateTimeField

object DateUtil{
  def currentDate = DateTime.now()
  def addDays(dateTime: DateTime, days: Int): DateTime = dateTime.plusDays(days)
  def longStringToDateTime(stringInMillis: String): DateTime = new DateTime(stringInMillis.toLong)
  def dateTimeToLong(dateTime: DateTime): Long = dateTime.toDate.getTime

}
