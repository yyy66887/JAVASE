package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("12312312");
		list.add("1231");
		list.add("122");
		list.add("1212");
		list.add("122312");
		list.add("12312");
		list.add("12");
		System.out.println(list);
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);


	}

}
