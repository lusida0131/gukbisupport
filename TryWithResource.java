package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TryWithResource {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(file)) {
			writer.write('a');
			writer.write('z');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
