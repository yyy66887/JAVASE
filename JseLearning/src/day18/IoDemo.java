package day18;

import java.io.FileWriter;
import java.io.IOException;

public class IoDemo {

	public static void main(String[] args) throws IOException {
		//����һ��FW���󣬸ö���һ����ʼ������Ҫ��ȷ���������ļ�
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼�£������Ŀ¼����ͬ���ļ������ᱻ����
//		FileWriter fw =new FileWriter("C:\\Users\\charmyyy\\Desktop\\�����˺� (2).txt");
//		
//		//����write����,���ַ���д������
//		fw.write("12312312312");
//		
//		//ˢ��������Ļ������е�����
//		//������ˢ���ļ���
////		fw.flush();
//
//		//�ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ��Ļ����е�����
//		//������ˢ��Ŀ�ĵ���
//		//��flush()������flush()ˢ�º������Լ���ʹ�ã�close()ˢ�º�����ر�
//		fw.close();
		FileWriter fw = new FileWriter("C:\\Users\\charmyyy\\Desktop\\�����˺� (2).txt",true);
		fw.write("ssdf\r\nwewe");
		fw.close();
	}

}
