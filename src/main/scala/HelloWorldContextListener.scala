import javax.servlet._
import javax.servlet.http._

class HelloWorldContextListener extends ServletContextListener {
  override def contextInitialized(sce: ServletContextEvent) = { 
    println("we're running")
    val ctx = sce.getServletContext
    println(ctx.getClass)
  }
  override def contextDestroyed(sce: ServletContextEvent) = {
    println("we're shutting down")
  }
}

