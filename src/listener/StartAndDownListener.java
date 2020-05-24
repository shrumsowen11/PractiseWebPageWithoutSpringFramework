package listener;

import javax.servlet.ServletContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener

public class StartAndDownListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		  System.out.println("Email sending......................................................................");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("**************Hello***************");
		System.out.println("**************Application is up and running*************");
		System.out.println("**************Hello***************");
		ServletContext servletContext=sce.getServletContext();
		servletContext.setAttribute("email", "shrums@gmail.com");
		servletContext.setAttribute("mobile", "15156435");
		servletContext.setAttribute("address", "dfsgsdfg");

	}
	

}
