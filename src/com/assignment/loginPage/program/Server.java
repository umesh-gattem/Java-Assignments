package com.assignment.loginPage.program;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.Logger;

/**
 * A class Server creates a individual clients where it checks whether the user
 * needs to login or register.
 * 
 * @author umesh
 * 
 * @since 14-07-2016
 *
 */

public class Server {

	private static Logger LOGGER = Logger.getLogger(Server.class);
	static ServerSocket serverSocket = null;
	static Socket clientSocket = null;

	public static void main(String[] args) {
		try {
			serverSocket = new ServerSocket(2026);
		} catch (IOException e) {
			LOGGER.info("IOException");
		}
		LOGGER.info("Server is started:");
		while (true) {
			try {
				clientSocket = serverSocket.accept();
			} catch (IOException e) {
				LOGGER.info("IOException");
			}
			new IndividualClient(clientSocket).start();
		}
	}
}