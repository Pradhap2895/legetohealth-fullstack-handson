package com.daythree.sixthtactivity;

public class User extends Software implements Text, VideoCall {

	private String name;

	public User(String name) {
		installed();
		this.name = name;
	}

	@Override
	public void doVideoCall() {
		System.out.println(name + " connecting video call");

	}

	@Override
	public void sentCharacters() {
		System.out.println(name + " Sents texts");

	}

	@Override
	public void sentEmojis() {
		System.out.println(name + " Sents Emojis");

	}

	@Override
	public void sentGif() {
		System.out.println(name + " Sents Gif's");

	}

	@Override
	public void connect() {
		System.out.println(name + " Connected");

	}

}
