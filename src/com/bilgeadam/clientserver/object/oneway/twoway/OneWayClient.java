package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// OneWay: Client - Server
public class OneWayClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 4999);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("hello");
		pr.flush();
	}
}