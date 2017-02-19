package com.msp.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Handler implements HttpHandler {

	@Override
	public void handle(HttpExchange arg0) throws IOException {

		String resp="Hello:-"+System.getProperty("user.name");
		Headers in=arg0.getRequestHeaders();
		Set<String> set=in.keySet();
		Iterator<String> it= set.iterator();
		while(it.hasNext())
		{
			System.out.println(""+it.next());
		}
		
		arg0.sendResponseHeaders(200, resp.length());
		OutputStream out=arg0.getResponseBody();
		out.write(resp.getBytes());
		out.close();
	}

}
