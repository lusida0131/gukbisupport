package ch32;

import java.io.IOException;
import java.io.Writer;

class TextWriter {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data.txt")) {
			for(int ch = (int)'A'; ch < (int)('Z' + 1); ch++)
				out.write(ch);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
