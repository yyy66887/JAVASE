package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {
	public static void main(String args[]) {

		copy();
	}

	public static void copy(){
		FileReader fr = null;
		FileWriter fw =null;
		try {
			fr = new FileReader("C:\\Users\\charmyyy\\Desktop\\…œÕ¯’À∫≈ (2).txt");
			fw = new FileWriter("C:\\Users\\charmyyy\\Desktop\\…œÕ¯’À∫≈ (2)_backup.txt");
			char[] buf = new char[1024];
			int num = 0;
			while((num=fr.read(buf))!=-1){
				fw.write(buf, 0, num);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
