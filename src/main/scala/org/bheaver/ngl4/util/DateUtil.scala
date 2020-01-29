package org.bheaver.ngl4.util
import java.text.SimpleDateFormat
import java.util.Date

import com.github.nscala_time.time.Imports._
import org.joda.time
import org.joda.time.DateTimeField

object DateUtil{
  val legacyDateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss")
  def currentDate = DateTime.now()
  def addDays(dateTime: DateTime, days: Int): DateTime = dateTime.plusDays(days)
  def longStringToDateTime(stringInMillis: String): DateTime = new DateTime(stringInMillis.toLong)
  def dateTimeToLong(dateTime: DateTime): Long = dateTime.toDate.getTime
  def legacyDateStringToDate(legacyDate: String): Date = legacyDateFormat.parse(legacyDate)
}
