package org.bgprocess.refuctoring;

public class HelloWorld extends Mouth {
	
	static final String UNUSED_SOMETHING = "!";
	
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
