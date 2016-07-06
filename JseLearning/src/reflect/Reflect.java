package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Reflect {
	public static void main(String args[]) throws Exception {
		Class clazz = Class.forName("reflect.Person");// Person类在内存中的字节码对象。
		// Person p = (Person)clazz.newInstance();
		// Constructor c = clazz.getDeclaredConstructor(int.class);
		// c.setAccessible(true);//强暴
		// Person p = (Person)c.newInstance(18);
		// System.out.println(p.name);
		// Method m1 = clazz.getMethod("me3",String.class );
		// String value = (String)m1.invoke(clazz.newInstance(), "sds");
		// System.out.println(value);
		Person p = (Person) clazz.newInstance();
		// Method m = clazz.getDeclaredMethod("me4", Date.class);
		// m.setAccessible(true);
		// m.invoke(p, new Date());
		//
	//	Method M = clazz.getMethod("me6", String[].class);
		//M.invoke(null, new Object[] { new String[] { "a", "b" } });
		Field f = clazz.getDeclaredField("age");
		f.setAccessible(true);
		int age = (Integer)f.get(p);
		System.out.println(age);
		f.set(p, 20);
//		f.set(p, "dabiaoge");
		System.out.println(p.getAge());
	}
}
