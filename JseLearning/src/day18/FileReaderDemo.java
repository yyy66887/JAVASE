package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String args[]) throws IOException{
		//����һ���ļ���ȡ�����ָ�����Ƶ��ļ������
		
		FileReader fr = new FileReader("C:\\Users\\charmyyy\\Desktop\\�����˺� (2).txt");
		
		//��һ�ַ���
		//���ö�ȡ�����read����
		//read()һ�ζ�һ���ַ�
//		int ch = 0;
//		while((ch=fr.read())!=-1){
//			System.out.println((char)ch);
//		}
		//�ڶ��ַ���
		char[] buf = new char[1024];
		int num = 0;
		while((num=fr.read(buf))!=-1){
			System.out.println(new String(buf,0,num));
		}
		fr.close();

	}
}
