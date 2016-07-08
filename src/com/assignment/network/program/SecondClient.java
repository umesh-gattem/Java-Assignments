package com.assignment.network.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This is the Second Client class where client socket is used to connect with
 * the server and all clients and server are communicated with the messages
 * 
 * @author umesh
 * 
 * @since 08-07-2016
 *
 */
public class SecondClient {

	public static void main(String[] args) {

		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			Socket clientSocket = new Socket(inetAddress, 2023);
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = clientSocket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			InputStream inputReader = clientSocket.getInputStream();
			BufferedReader readServer = new BufferedReader(new InputStreamReader(inputReader));
			System.out.println("Client is started...");
			String writetoServer, readfromServer;
			boolean flag = true;
			while (flag) {
				writetoServer = bufferReader.readLine();
				printWriter.println(writetoServer);
				printWriter.flush();
				if ((readfromServer = readServer.readLine()) != null) {
					System.out.println("Message from Server: " + readfromServer);
				}
				if ((readfromServer.equals("Quit"))) {
					System.out.println("Client and Server are disconnecting");
					flag = false;
				}
			}
			clientSocket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}