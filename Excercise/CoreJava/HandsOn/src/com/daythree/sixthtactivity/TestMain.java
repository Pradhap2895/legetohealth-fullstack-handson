package com.daythree.sixthtactivity;

public class TestMain {
	public static void main(String[] args) {
		Text c = new User("Pradhap");
		c.connect();
		c.sentCharacters();
		c.sentGif();
		System.out.println("------------------------");
		VideoCall vc = new User("Muthu");
		vc.connect();
		vc.doVideoCall();
	}

}
