package com.concept.loadorder;

public class StaticLoadClass {

	StaticLoadClass() {
		System.out.println("hi");
	}

	{
		System.out.println("hi");
	}

	public static final int THE_ONE = 1;
	public static int NOT_THE_ONE = 0;

	public static ServerConnection serverConnection = new ServerConnection();

}

class ServerConnection {

	ServerConnection() {
		System.out.println("ServerConnection");
	}
}