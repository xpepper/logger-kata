package com.xpeppers.tdd;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Logger {

	private Writer writer;

	public Logger(Writer writer) {
		this.writer = writer;
	}

	public void log(String string) throws IOException {
		if (!writer.toString().isEmpty())
			writer.write("\n");
		writer.write(string);
	}

}

class LogFactory {
	public static Logger create(String fileName) throws IOException {
		return new Logger(new PrintWriter(new FileWriter("log.txt")));
		
	}
}
