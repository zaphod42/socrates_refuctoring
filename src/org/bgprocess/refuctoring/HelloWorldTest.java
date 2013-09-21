package org.bgprocess.refuctoring;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void it_says_hello() {
		assertEquals("Hello world!", HelloWorld.hello());
	}

}
