package org.bgprocess.refuctoring;

public class HelloWorld extends Mouth {
	
	static final String HELLO = "Hello";
	static final String SOMETHING2 = " ";
	static final String SOMETHING = "!";
	static final String WORLD = "world";
	static final Mouth MOUTH = new Mouth();

	public static String hello() {
		SpeachBuilder speachWriter = new SpeachBuilder();
		return SpeachManager.control(speachWriter);
	}
	
	
}
