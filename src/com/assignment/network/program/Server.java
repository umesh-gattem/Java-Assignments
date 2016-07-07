package com.assignment.network.program;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]) {
		ServerSocket socketServer = null;
		String line;
		DataInputStream input;
		PrintStream output;
		Socket client = null;

		try {
			socketServer = new ServerSocket(2023);
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			client = socketServer.accept();
			System.out.println("server running");
			input = new DataInputStream(client.getInputStream());
			output = new PrintStream(client.getOutputStream());
			while (true) {
				line = input.readUTF();
				output.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}