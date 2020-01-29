package org.bheaver.ngl4.util

object StringUtil {
  def isEmpty(x: String): Boolean = Option(x).map(s => s.isEmpty).getOrElse(false)

  def isEmptyTrim(x: String) = Option(x).map(s => s.trim.isEmpty).getOrElse(false)

  def charToString(x: Char): String = Option(x).map(s => s.toString).getOrElse("")
}
