package ch33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

class FileCopierVerNIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		Path src = Paths.get(sc.nextLine());
		
		System.out.print("사본 이름: ");
		Path dst = Paths.get(sc.nextLine());
		
		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		try(FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ);
				FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			int num;
			while(true) {
				num = ifc.read(buf);
				if(num == -1)
					break;
				buf.flip();
				ofc.write(buf);
				buf.clear();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
