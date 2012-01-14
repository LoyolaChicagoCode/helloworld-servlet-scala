import javax.servlet.http._

class HelloWorld extends HttpServlet {
  override def doGet(req: HttpServletRequest, resp: HttpServletResponse) = { 
    resp.getWriter.println("Hello World!")
    resp.getWriter.println(new java.util.Date)
    resp.getWriter.println(getServletContext.getInitParameter("oax"))
    resp.getWriter.println(getServletContext.getClass)
  }
}
