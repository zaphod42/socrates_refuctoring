package org.bgprocess.refuctoring;

// Makes your life better
public class SpeachManager {

	static String control(SpeachBuilder speachWriter) {
		return speachWriter.sayHello(speachWriter) + speachWriter.saySomething2() + speachWriter.sayWorld() + speachWriter.saySomething();
	}

}
