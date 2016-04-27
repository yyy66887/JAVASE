
package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillDemo {
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("12312312");
		list.add("1231");
		list.add("122");
		list.add("1212");
		list.add("122312");
		list.add("12312");
		list.add("12");

		System.out.println(list);
		Collections.fill(list, "110");
		System.out.println(list);



	}
	
}
