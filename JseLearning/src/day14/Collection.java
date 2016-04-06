package day14;

import java.util.Enumeration;
import java.util.Vector;

public class Collection {
	public static void main(String[] args){
		Vector<String> v= new Vector<String>();
		v.add("11");
		v.add("12");
		v.add("13");
		v.add("14");

		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
