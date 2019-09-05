package org.bheaver.ngl4.util

object StringUtil {
  def isEmpty(x: String) = x == null || x.isEmpty

  def isEmptyTrim(x: String) = x == null || x.trim.isEmpty
}
