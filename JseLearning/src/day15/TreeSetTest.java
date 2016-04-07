package day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//´æ×Ö·û´®£¬°´×Ö·û´®³¤¶ÈÅÅÐò
public class TreeSetTest {
	public static void main(String args[]){
		String a="abc";
		String b="ac";
		String c="abcde";
		String d="abcdefg";
		String e="abcde";
		String f="bcdes";
		
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int num = new Integer(o1.length()).compareTo(o2.length());
				if(num==0){
					num = o1.compareTo(o2);
				}
				return num;
			}
			
		});
		ts.add(a);
		ts.add(b);
		ts.add(c);
		ts.add(d);
		ts.add(e);
		ts.add(f);
		Iterator<String> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
