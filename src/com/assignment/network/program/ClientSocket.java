package com.assignment.network.program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocket {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Socket client = null;
		DataInputStream input = null;
		DataOutputStream output = null;
		try {
			client = new Socket("LocalHost", 2023);
			input = new DataInputStream(client.getInputStream());
			output = new DataOutputStream(client.getOutputStream());

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (client != null && output != null && input != null) {
			try {
				System.out.println("Client running");
				output.writeBytes("HELO\n");
				output.writeBytes("QUIT");
				String responseLine;
				while ((responseLine = input.readLine()) != null) {
					System.out.println("Server: " + responseLine);
					if (responseLine.indexOf("Ok") != -1) {
						break;
					}
				}
				output.close();
				input.close();
				client.close();
			} catch (IOException e) {
				System.err.println("IOException:  " + e);
			}

		}
	}
}
