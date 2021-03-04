package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FinallyCase {
	public static void main(String[] args) {
		Path file1 = Paths.get("C:\\Users\\404-09\\Simple.txt");
		BufferedWriter writer1 = null;
		
		try {
			writer1 = Files.newBufferedWriter(file1);
			writer1.write("qweqe");
			writer1.write('Z');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer1 != null)
				try {
					writer1.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
