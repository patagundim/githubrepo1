package com.msp.server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class MyServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
HttpServer server= HttpServer.create(new InetSocketAddress(8000),0);

server.createContext("/test/server/", new Handler());//createContext();
server.setExecutor(null);
server.start();
	}

}
