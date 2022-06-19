package com.zensar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ChatApplication {

	private static Map<String, TreeSet<String>> hmapUsers = new HashMap<>();
	private static Map<String, ArrayList<String>> hmapMessages = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);
	private static String loggedInUser = null;
	private static String activeChatRoom = null;
	
	public static void main(String[] args) {
		System.out.println("Welcome to chat application....");
		System.out.println("Please choose your option from below");
		System.out.println("1 - Create a chatroom");
		System.out.println("2 - Add the user");
		System.out.println("3 - User login");
		System.out.println("4 - Send a message");
		System.out.println("5 - Display the messages from a specific chatroom");
		System.out.println("6 - List down all users belonging to the specified chat room.");
		System.out.println("7 - Logout");
		System.out.println("8 - Delete an user");
		System.out.println("9 - Delete the chat room.");
		while(true) {
			int option = scanner.nextInt();
			switch(option) {
				case 1: createNewChatRoom(); break;
				case 2: addNewUser(); break;
				case 3: login(); break;
				case 4: sendMessage(); break;
				case 5: showMessages(); break;
				case 6: showUsers(); break;
				case 7: logout(); break;
				case 8: deleteUser(); break;
				case 9: deleteChatRoom(); break;
				default: System.out.println("Invalid option entered");
			}
		}
	}
	
	private static void createNewChatRoom() {
		String chatRoomName = scanner.next();
		if(hmapUsers.containsKey(chatRoomName)) {
			System.out.println("ChatRoom" + chatRoomName +" already exist");
		}
		else {
			hmapUsers.put(chatRoomName, new TreeSet<String>());
			hmapMessages.put(chatRoomName, new ArrayList<String>());
			System.out.println("ChatRoom "+ chatRoomName +"created successfully");
		}
	}
	private static void addNewUser() {
		System.out.println("Enter chat room name:");
		String chatRoomName = scanner.next();
		if(!hmapUsers.containsKey(chatRoomName)) {
			System.out.println("ChatRoom Name "+ chatRoomName +" does not exist");
		}
		else {
			System.out.println("Enter user name:");
			String username = scanner.next();
			TreeSet<String> users = hmapUsers.get(username);
			if(users.contains(username)) {
				System.out.println("User: " + username + " already exist inside"+ chatRoomName +" chat room");
			}
			else {
				users.add(username);
				System.out.println("User: " + username + " added inside"+ chatRoomName +" chat room");

			}
		}
	}
	private static void login() {}
	private static void sendMessage() {}
	private static void showMessages() {}
	private static void showUsers() {}
	private static void logout() {}
	private static void deleteUser() {}
	private static void deleteChatRoom() {}

}