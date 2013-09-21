package org.bgprocess.refuctoring;

public class HelloWorld extends Mouth {
	
	private static final String HELLO = "Hello";
	private static final String SOMETHING2 = " ";
	private static final String SOMETHING = "!";
	private static final String WORLD = "world";
	private static final Mouth MOUTH = new Mouth();

	public static String hello() {
		return MOUTH.speak(HELLO) + MOUTH.speak(SOMETHING2) + MOUTH.speak(WORLD) + MOUTH.speak(SOMETHING);
	}
}
