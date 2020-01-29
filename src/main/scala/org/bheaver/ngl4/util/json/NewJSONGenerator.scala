package org.bheaver.ngl4.util.json

import javax.servlet.http.HttpServletResponse
import org.bheaver.ngl4.util.exceptions.HTTPException
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.write

object NewJSONGenerator {

  private implicit val defaultFormats = DefaultFormats



  implicit def toJSONString[T <: HTTPException](t:T)(implicit httpServletResponse: HttpServletResponse): String =   {
    httpServletResponse.setStatus(t.statusCode)
    write(t)
  }
}



