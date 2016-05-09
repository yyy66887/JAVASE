package day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("L:\\Users\\charmyyy\\Desktop\\…œÕ¯’À∫≈ (2).txt");
			fw.write("12312312312");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fw!=null)
					fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
