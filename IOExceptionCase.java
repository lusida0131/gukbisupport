package ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

class IOExceptionCase {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\404-09\\Simple.txt");
		BufferedWriter writer = null;
		try {
		writer = Files.newBufferedWriter(file);
		writer.write("qweqe");
		writer.write('Z');
		
		if (writer != null)
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
