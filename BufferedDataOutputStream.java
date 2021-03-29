package ch32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedDataOutputStream {
	public static void main(String[] args) {
		try(DataOutputStream out =
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("data.dat")))) {
			out.writeInt(370);
			out.writeDouble(3.14);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
class BufferedDataInputStream {
	public static void main(String[] args) {
		try(DataInputStream in =
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream("data.dat")))){
			int num1 = in.readInt();
			double num2 = in.readDouble();
			System.out.println(num1);
			System.out.println(num2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}