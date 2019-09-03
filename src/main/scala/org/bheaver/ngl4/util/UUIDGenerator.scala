package org.bheaver.ngl4.util

import java.util.UUID

object UUIDGenerator {
  def generateReturnRequestId(requestIdOpt: String) : String = {
    Option(requestIdOpt).getOrElse(UUID.randomUUID().toString)
  }
}
