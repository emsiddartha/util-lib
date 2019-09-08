package org.bheaver.ngl4.util.exceptions

class BadRequestException(val message: String) extends HTTPException {
  override def statusCode = 400
}