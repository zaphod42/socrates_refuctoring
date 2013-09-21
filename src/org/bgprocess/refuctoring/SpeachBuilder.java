package org.bgprocess.refuctoring;

import java.lang.reflect.Field;

public class SpeachBuilder {
	
	public static SpeachBuilder aSpeachBuilder(){
		return new SpeachBuilder();
	}

	String sayHello(SpeachBuilder speachWriter) {
		return new Mouth().speak(new IPA().getBrownAle()+"e"+new DoubleIPA().setLager()+"o");
	}

	String saySomething2() {
		return new Mouth().speak("\u0020");
	}

	String sayPiratically() {
		try {
			return new Mouth().speak((String) second().get(HelloWorld.class));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private Field second() {
		return HelloWorld.class.getDeclaredFields()[0];
	}

	String sayWorld() {
		return new Mouth().speak("wor"+new IPA().setLager()+"d");
	}
	

}
