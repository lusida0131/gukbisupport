package ch32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


class SimpleWriter {
	public static void main(String[] args) {
		try(Writer out = new FileWriter("data.txt")) {
			out.write('A');
			out.write('한');
			out.write('글');
			out.write("영어");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
