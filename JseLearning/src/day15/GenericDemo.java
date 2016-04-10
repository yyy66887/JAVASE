package day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo {
	
	
	public static void main(String args[]){
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		ts.add(new Student("abc"));
		ts.add(new Student("vbc"));
		ts.add(new Student("dbc"));
		ts.add(new Student("acc"));
		ts.add(new Student("ebc"));
		ts.add(new Student("bbc"));
		Iterator<Student> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	

}
class Student extends Person{
	Student(String name){
		super(name);
	}
	
}
class Workers extends Person{
	Workers(String name){
		super(name);
	}

	
}
