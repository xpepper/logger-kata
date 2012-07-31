package com.xpeppers.tdd;

import static org.junit.Assert.*;

import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

public class LoggerTest {

	private StringWriter writer;
	private Logger logger;

	@Before
	public void setUp() {
		writer = new StringWriter();
		logger = new Logger(writer);		
	}
	
	@Test
	public void emptyStringIsNotLogged() throws Exception {
		logger.log("");
		
		assertEquals("", writer.toString());
	}
	
	@Test
	public void notEmptyStringIsLogged() throws Exception {
		
		logger.log("hi there!");
		
		assertEquals("hi there!", writer.toString());		
	}
	
	@Test
	public void multipleLinesAreLoggedOnMultipleLines() throws Exception {
		logger.log("hi there!");
		logger.log("I'm Piero.");
		
		assertEquals("hi there!\nI'm Piero.", writer.toString());
	}

}
