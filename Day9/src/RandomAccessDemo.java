import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("e:\\zensar2\\raf.txt");
		f.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeChars("Sample content");
		System.out.println("Completed file operations");
	}

}
