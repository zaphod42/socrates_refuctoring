package org.bgprocess.refuctoring;

// Makes your life better
public class SpeachManager implements MuteSpeaechManagerINterface {

	static String control(SpeachBuilder speachWriter) throws Exception{
		     return speachWriter.sayHello(speachWriter) + speachWriter.saySomething2() + speachWriter.sayWorld() + speachWriter.sayPiratically();
				
	}

}
