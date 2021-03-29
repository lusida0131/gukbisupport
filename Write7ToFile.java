package ch32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Write7ToFile {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.dat");
		out.write(7);
		out.close();
	}
}
class Read7FromFile {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("data.dat");
		int dat = in.read();
		in.close();
		System.out.println(dat);
	}
}