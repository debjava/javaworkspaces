package com.ddlab.rnd.osgi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ddlab.rnd.osgi.api.impl.CoreApiImpl;

public class CheckServlet extends HttpServlet 
{
	private static final long serialVersionUID = -6777960570338255528L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("doPost Method of WebPageServlet ...");
		CoreApiImpl impl = new CoreApiImpl();
		impl.show();
		StringBuilder builder = new StringBuilder();
		builder.append("\n------------ END ------------");
		builder.append("\n------------ LIST OF ENV VARS ------------");
		Map<String,String> map = System.getenv();
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while( itr.hasNext()) {
			Map.Entry<String, String> me = itr.next();
			System.out.println(me.getKey()+"-----"+me.getValue());
			builder.append("\n").append(me.getKey()+"---"+me.getValue()).append("\n");
		}
		builder.append("\n------------ END ------------");
		System.out.println("-------->"+builder.toString());
		PrintWriter out = response.getWriter();
		out.println(builder.toString());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("doGet Method of WebPageServlet ...");
		doPost(request, response);
	}
	
}
