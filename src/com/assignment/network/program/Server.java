package com.assignment.network.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This is the Server class where server socket accepts the client socket and
 * connection is made between the server and client and they are communicated
 * with help of messages
 * 
 * @author umesh
 * 
 * @since 08-07-2016
 *
 */
public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket serverSocket = new ServerSocket(2023);
			Socket clientSocket = serverSocket.accept();
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
			BufferedReader readClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String writetoClient, readfromClient;
			System.out.println("Server is started..");
			boolean flag = true;
			while (flag) {
				if ((readfromClient = readClient.readLine()) != null) {
					System.out.println("message from Client:  " + readfromClient);
				}
				if (readfromClient.equals("Quit")) {
					System.out.println("Client and Server are disconnecting");
					flag = false;
				}
				writetoClient = bufferReader.readLine();
				printWriter.println(writetoClient);
				printWriter.flush();
			}
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}