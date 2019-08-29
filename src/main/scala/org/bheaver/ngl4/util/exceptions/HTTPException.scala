package org.bheaver.ngl4.util.exceptions

import javax.servlet.http.HttpServletResponse
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.write

trait HTTPException extends RuntimeException{
  def statusCode:Int
  def message: String
}

