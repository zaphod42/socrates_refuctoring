package org.bgprocess.refuctoring;

public class HelloWorld extends Mouth {
	
	static final String HELLO = new IPA().getBrownAle()+"e"+new DoubleIPA().setLager()+"o";
	static final String SOMETHING2 = " ";
	static final String SOMETHING = "!";
	static final String WORLD = "wor"+new IPA().setLager()+"d";
	static final Mouth MOUTH = new Mouth();

	public static String hello() {
		
		
		SpeachBuilder speachWriter = new SpeachBuilder();
		try{
			throw new NullPointerException();
		}catch(Exception e){
			//This should never happen (almost)
		}finally {
			
			try {
				return SpeachManager.control(speachWriter);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
}
