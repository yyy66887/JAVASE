package day14;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args){
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("yang","11"));
		hs.add(new Person("yang","11"));
		hs.add(new Person("yang","22"));
		hs.add(new Person("yi","22"));
		hs.add(new Person("yi","22"));
		hs.add(new Person("yue","22"));
		hs.add(new Person("yue","33"));
		hs.add(new Person("yue","33"));
		Iterator<Person> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
