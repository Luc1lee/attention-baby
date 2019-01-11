package com.dlx.ababy.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SimpleCORSFilter
 */
public class SimpleCORSFilter implements Filter {

	private boolean isCross = false;
    /**
     * Default constructor. 
     */
    public SimpleCORSFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		 if (isCross) {
	            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
	            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
	            System.out.println("拦截请求: " + httpServletRequest.getServletPath());
	            httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
	            httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	            httpServletResponse.setHeader("Access-Control-Max-Age", "0");
	            httpServletResponse.setHeader("Access-Control-Allow-Headers",
	                    "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
	            httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
	            httpServletResponse.setHeader("XDomainRequestAllowed", "1");
	        }
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		 String isCrossStr = filterConfig.getInitParameter("IsCross");
	        isCross = isCrossStr.equals("true") ? true : false;
	        System.out.println(isCrossStr);
	}

}
