package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercises {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge("11");
		p1.setName("yyy");
		Person p2 = new Person();
		p2.setAge("110");
		p2.setName("aaa");
		Person p3 = new Person();
		p3.setAge("11");
		p3.setName("yyy");
		Person p4 = new Person();
		p4.setAge("115");
		p4.setName("bb");
		Person p5 = new Person();
		p5.setAge("11");
		p5.setName("yy");
		Person p6 = new Person();
		p6.setAge("110");
		p6.setName("aaa");
		Person p7 = new Person();
		p7.setAge("11");
		p7.setName("yyy");
//		System.out.println(p.equals(q));
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p7);
		al.add(p6);
		al.add(p5);
		al.add(p4);
		al.add(p3);
		al.add(p2);
		al.add(p1);
		ArrayList<Person> nal = remvC(al);
		for(Person p : nal){
			System.out.println(p);
		}

		
		

//		String s1,s2,s3,s4;
//		s1 = "yyy";
//		s2 = "yyy";
//		s3 = new String("yyy");
//		s4 = new String(s3);
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
		
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("java01");
//		al.add("java01");
//		al.add("java01");
//		al.add("java02");
//		al.add("java02");
//		al.add("java03");
//		al.add("java03");
//		al.add("java04");
//		al.add("java05");
//		System.out.println(remvC(al));

	}
	public static ArrayList<Person> remvC(ArrayList<Person> al){
		ArrayList<Person> newal = new ArrayList<Person>();
		Iterator<Person> it = al.iterator();
		while(it.hasNext()){
			Person p = it.next();
			if(!newal.contains(p)){
				newal.add(p);
			}
		}
		return newal;		
	}
//	public static ArrayList<String> remvC(ArrayList<String> al){
//		ArrayList<String> newal = new ArrayList<String>();
//		Iterator<String> it = al.iterator();
//		while(it.hasNext()){
//			String cur = it.next();
//			if(!newal.contains(cur)){
//				newal.add(cur);
//			}
//		}
//		return newal;
//	}

}
