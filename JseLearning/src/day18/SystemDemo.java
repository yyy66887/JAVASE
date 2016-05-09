package day18;

import java.util.Properties;


public class SystemDemo {
	public static void main(String[] args) {
		Properties pro = System.getProperties();
		for(Object obj :pro.keySet()){
			System.out.println(obj+"::::"+pro.get(obj));
		}
	}

}
