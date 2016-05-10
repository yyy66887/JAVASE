package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String args[]) throws IOException{
		//创建一个文件读取对象和指定名称的文件相关联
		
		FileReader fr = new FileReader("C:\\Users\\charmyyy\\Desktop\\上网账号 (2).txt");
		
		//第一种方法
		//调用读取对象的read方法
		//read()一次读一个字符
//		int ch = 0;
//		while((ch=fr.read())!=-1){
//			System.out.println((char)ch);
//		}
		//第二种方法
		char[] buf = new char[1024];
		int num = 0;
		while((num=fr.read(buf))!=-1){
			System.out.println(new String(buf,0,num));
		}
		fr.close();

	}
}
