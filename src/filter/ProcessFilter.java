package filter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//(/*) --> intercepting all the incoming requests  --> sabbailai rokirakhyeko cha
@WebFilter(filterName="processFilter")
public class ProcessFilter implements Filter {
	
	Set<String> allowedResources = new HashSet<>();
	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request; //this is child of ServletRequest
		String resourceName = httpServletRequest.getServletPath(); //resourceName --> gets url -> anything jsp, servlet,
		System.out.println("This \t"+resourceName + " came at " + LocalDateTime.now());
		if (allowedResources.contains(resourceName) ||
				resourceName.contains("Images/") ||
				resourceName.contains("css/")) {

			chain.doFilter(request, response); 	// this statement allows the server to step ahead, if this is not
												// written, then the server will not go ahead
		} else {
			HttpSession session = httpServletRequest.getSession(false); // here, we are checking if the session is
																		// already made over there or not, if the
																		// session is not there, then it will be
																		// returning the NULL value
																		//if there is logged in or not
			if (session != null && session.getAttribute("userData") != null) {//if you get the logged in infos
				chain.doFilter(request, response);

			} else {												//this line says if not found the logged in information
				((HttpServletResponse) response).sendRedirect(httpServletRequest.getContextPath() + "/index.jsp");
					//	HttpServletResponse) response 		--> 	this is child of ServletResponse similar to above
					//  .sendRedirect(path) 				-->		sends to the "pathYouWantedToSend/pageYouWantedToSend"
					//	httpServletRequest.getContextPath() -->		calls "/PractiseWebPage", after which we are adding the /index.jsp
					//	http://localhost:8080 				-->	 	called by Default
					//	Actual Path in the browser			--> 	http://localhost:8080/PractiseWebPage/index.jsp
					//	
			
			}
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		allowedResources.add("/index.jsp");
		allowedResources.add("/loginServlet");
		allowedResources.add("/register.jsp");
		allowedResources.add("/registerProcessServlet");
		allowedResources.add("/unavaliable.jsp");


	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

}
