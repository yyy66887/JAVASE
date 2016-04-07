package day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]){
		TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(Integer.parseInt(o1.getAge())<Integer.parseInt(o2.getAge())){
					return -1;
				}else if(Integer.parseInt(o1.getAge())==Integer.parseInt(o2.getAge())){
					return o1.getName().compareTo(o2.getName());
				}else
				return 1;
			}
			
		});
//		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("yang","25"));
		ts.add(new Person("yi","35"));
		ts.add(new Person("yue","10"));
		ts.add(new Person("a","2"));
		ts.add(new Person("a","9"));
		ts.add(new Person("b","9"));
		ts.add(new Person("e","9"));
		ts.add(new Person("b","9"));
		ts.add(new Person("c","100"));
		ts.add(new Person("d","95"));
		ts.add(new Person("e","33"));

		Iterator<Person> it = ts.iterator();
		System.out.println(ts.size());
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(ts.contains(new Person("yang","25")));
	}
}
