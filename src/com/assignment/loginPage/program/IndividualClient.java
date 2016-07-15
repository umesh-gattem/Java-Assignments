package com.assignment.loginPage.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.Logger;

/**
 * A class Individualclients support to create the different clients and perform
 * operation like login and register.
 * 
 * @author umesh
 * 
 * @since 14-07-2016
 *
 */

public class IndividualClient extends Thread{

	private static Logger LOGGER = Logger.getLogger(Server.class);
	static ServerSocket serverSocket = null;
	static BufferedReader readFromClient = null;
	public Socket socket;

	/**
	 * Invoke the constructor to initialize the new socket
	 * 
	 * @param clientSocket
	 */

	public IndividualClient(Socket socket) {
		this.socket = socket;
	}

	/**
	 * A run method to find whether the user wants to login or register.
	 * 
	 */

	public void run() {
		while (true) {
			String readClient;
			try {
				readFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				if ((readClient = readFromClient.readLine()) != null) {
					if (readClient.charAt(0) == '2') {
						readClient = readClient.substring(1);
						registerTheUser(readClient, socket);
					} else {
						loginTheUser(readClient, socket);
					}
				}
			} catch (IOException e) {
				LOGGER.info("IOException");
			}
		}
	}

	/**
	 * A method registerTheUser will be called when user wants to register into
	 * the account. if already registered user tries to register it will give
	 * appropriate message.
	 * 
	 * @param user
	 * @param serverSocket
	 */

	private static void registerTheUser(String user, Socket socket) {
		String file = "../Java Assignments/UserDetails.txt";
		String contentsofFile;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			while ((contentsofFile = bufferedReader.readLine()) != null) {
				if (contentsofFile.equals(user)) {
					String message = "User is already registered";
					serviceInfo(socket, message);
				}
			}
			bufferedReader.close();
			BufferedWriter bufferwriter;
			bufferwriter = new BufferedWriter(new FileWriter(file, true));
			bufferwriter.write(user + "\n");
			bufferwriter.close();
			String message = "New user is registered";
			serviceInfo(socket, message);
		} catch (FileNotFoundException e) {
			LOGGER.info("File not Found");
		} catch (IOException e) {
			LOGGER.info("IOException");
		}
	}

	/**
	 * A method loginTheUser will be called when user wants to login to account.
	 * It checks whether the user is new user or already registered user. If the
	 * new user login then its gives the message "User is not registered". If
	 * the user is already registered then it gives message
	 * "User Logged in Successfully".
	 * 
	 * @param user
	 * @param clientSocket
	 */

	public static void loginTheUser(String user, Socket socket) {
		String file = "../Java Assignments/UserDetails.txt";
		try {
			String contentsofFile;
			boolean flag = true;
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			while ((contentsofFile = bufferedReader.readLine()) != null) {
				if (contentsofFile.equals(user)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				String message = "User is not registered";
				serviceInfo(socket, message);
			} else {
				String message = "Logged in Successfully";
				serviceInfo(socket, message);
			}
			bufferedReader.close();
		} catch (IOException e) {

		}
	}

	/**
	 * A method ServiceInfo is called when the old user login to the account.
	 * This will send message saying "Logged in Successfully" or if the user is
	 * not yet registered then it will give appropriate message in the client
	 * page.
	 * 
	 * @param clientSocket
	 * @param serverSocket
	 */

	private static void serviceInfo(Socket clientSocket, String message) {
		try {
			PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
			printWriter.println(message);
			printWriter.flush();
		} catch (IOException e) {
			LOGGER.info("IOException");
		}
	}
}
