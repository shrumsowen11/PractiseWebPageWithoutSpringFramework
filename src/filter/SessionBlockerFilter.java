package filter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.utils.LocalTimeUtil;



//All the incoming request
@WebFilter(filterName="blockingFilter")
public class SessionBlockerFilter implements Filter {
	
private Set<String> allowedUrls=new HashSet<>();
	
	private  long startTime=00*60*60*1000;
	private  long endTime=24*60*60*1000;
	
	
	private void updateTimeBlocker(HttpServletRequest httpServletRequest) {
	ServletContext servletContext = httpServletRequest.getServletContext();
	Integer blockerTimeFlag =(Integer) servletContext.getAttribute("blockerTimeFlag");
	if(blockerTimeFlag != null && blockerTimeFlag == 0) {
		startTime = (long) servletContext.getAttribute("startTimeInMillis");
		endTime = (long) servletContext.getAttribute("endTimeInMillis");
	}
	
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//Reference type casting = Downcasting
		 HttpServletRequest httpServletRequest =(HttpServletRequest)request;
		 updateTimeBlocker(httpServletRequest);  //this method is defined just above this "doFilter()" method
		 
		 String resourceName=httpServletRequest.getServletPath();
		 System.out.println("BlockingFilter Accessing resource = "+resourceName+" at time  "+LocalDateTime.now());
					  long cTime = LocalTimeUtil.currentTime();
					  if(resourceName.equalsIgnoreCase("/unavaliable.jsp") ||
							  resourceName.contains("Images/")||
								resourceName.contains("css/")) {
						  chain.doFilter(request, response);
					  }
					  else  if( cTime>startTime && cTime<endTime) {
						  chain.doFilter(request, response);
					  }else {
						   //http://localhost:9999/happy-hours
					       ((HttpServletResponse) response).sendRedirect(httpServletRequest.getContextPath()+"/unavaliable.jsp");
					  }
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		allowedUrls.add("/unavaliable.jsp");
		//Accesing  data 
		ServletContext  se= filterConfig.getServletContext();
	}

}
