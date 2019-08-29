package org.bheaver.ngl4.util.json

import javax.servlet.http.HttpServletResponse
import org.bheaver.ngl4.util.exceptions.HTTPException
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.write

object ExceptionJSONGenerator {

  case class ExceptionResponse(message: String, statusCode: Int)

  trait JSONGenerator[T] {
    def toJSON(value: T, httpServletResponse: HttpServletResponse): String
  }

  object JSONGenerator {
    def toJSON[T](value: T, httpServletResponse: HttpServletResponse)(implicit generator: JSONGenerator[T]): String = generator.toJSON(value, httpServletResponse)
  }

  implicit object HTTPExceptionJSONGenerator extends JSONGenerator[HTTPException] {
    override def toJSON(value: HTTPException, httpServletResponse: HttpServletResponse): String = {
      implicit val formats = DefaultFormats
      httpServletResponse.setStatus(value.statusCode)
      write(ExceptionResponse(value.message, value.statusCode))
    }
  }

}