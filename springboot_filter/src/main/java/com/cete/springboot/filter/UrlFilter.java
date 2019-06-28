package com.cete.springboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "test", urlPatterns = "/test/*")
public class UrlFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String requestURI = req.getRequestURI();
		System.out.println("--------------------->过滤器：请求地址" + requestURI);
		if (!requestURI.contains("hello")) {
			req.getRequestDispatcher("/test/fail").forward(req, response);
		} else {
			chain.doFilter(req, response);
		}
	}

	@Override
	public void destroy() {
		System.out.println("----------------------->过滤器被销毁");
	}

}
