package day18;

import java.io.FileWriter;
import java.io.IOException;

public class IoDemo {

	public static void main(String[] args) throws IOException {
		//创建一个FW对象，该对象一被初始化必须要明确被操作的文件
		//而且该文件会被创建到指定目录下，如果该目录下有同名文件，将会被覆盖
//		FileWriter fw =new FileWriter("C:\\Users\\charmyyy\\Desktop\\上网账号 (2).txt");
//		
//		//调用write方法,将字符串写到流中
//		fw.write("12312312312");
//		
//		//刷新流对象的缓冲区中的数据
//		//将数据刷到文件中
////		fw.flush();
//
//		//关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据
//		//将数据刷到目的地中
//		//和flush()的区别：flush()刷新后，流可以继续使用，close()刷新后，流会关闭
//		fw.close();
		FileWriter fw = new FileWriter("C:\\Users\\charmyyy\\Desktop\\上网账号 (2).txt",true);
		fw.write("ssdf\r\nwewe");
		fw.close();
	}

}
