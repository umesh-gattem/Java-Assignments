package com.assignment.loginPage.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * A class Client is used to enter the username and password of the new user.
 * The server will respond based upon the operation of user like "login" or
 * "register"
 * 
 * @author umesh
 * 
 * @since 14-07-2016
 *
 */

public class Client {

	private static Logger LOGGER = Logger.getLogger(Client.class);
	static Socket clientSocket = null;
	static PrintWriter writeToServer = null;
	static BufferedReader readFromServer = null;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			clientSocket = new Socket(inetAddress, 2026);
			writeToServer = new PrintWriter(clientSocket.getOutputStream(), true);
			readFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			LOGGER.info("Client is started");
			while (true) {
				LOGGER.info("Enter the UserName:");
				String userName = null;
				userName = bufferReader.readLine();
				LOGGER.info("Enter the Password:");
				String password = null;
				password = bufferReader.readLine();
				LOGGER.info("1.LOGIN \t 2.REGISTER");
				LOGGER.info("Press 1 for Login\t press 2 for Register");
				int choice = scan.nextInt();
				if (choice == 1) {
					writeToServer.println(userName + "\t\t" + password);
				} else if (choice == 2) {
					writeToServer.println("2" + userName + "\t\t" + password);
				}
				String readServer;
				if ((readServer = readFromServer.readLine()) != null) {
					LOGGER.info(readServer);
				}
			}
		} catch (UnknownHostException e) {
			LOGGER.info("Host not found");
		} catch (IOException e) {
			LOGGER.info("IOException");
		}
	}
}
