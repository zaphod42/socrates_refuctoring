package org.bgprocess.refuctoring;

public class SpeachBuilder {
	
	public static SpeachBuilder aSpeachBuilder(){
		return new SpeachBuilder();
	}

	String sayHello(SpeachBuilder speachWriter) {
		return HelloWorld.MOUTH.speak(HelloWorld.HELLO);
	}

	String saySomething2() {
		return HelloWorld.MOUTH.speak(HelloWorld.SOMETHING2);
	}

	String saySomething() {
		return HelloWorld.MOUTH.speak(HelloWorld.SOMETHING);
	}

	String sayWorld() {
		return HelloWorld.MOUTH.speak(HelloWorld.WORLD);
	}
	

}
