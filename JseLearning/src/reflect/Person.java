package reflect;

import java.beans.Introspector;
import java.util.Date;

public class Person {
	public String name = "yy";
	private int age = 18;
	
	public int getAge() {
		return age;
	}
	public Person(){
		System.out.println("默认方法执行了");
	}
	public Person(String name,int age){
		System.out.println(name+"="+age);
	}
	public Person(String name){
		System.out.println("姓名="+name);
	}
	private Person(int age){
		System.out.println(age);
	}
	
	public void me1(){
		System.out.println("访问方法");
	}
	public void me2(String name){
		System.out.println(name);
	}
	public String me3(String name){
		System.out.println(name);
		return name;
	}
	private void me4(Date d){
		System.out.println(d);
	}
	public static void me5(){
		System.out.println("m5");
	}
	public static void me6(String[] args){
		System.out.println("me6");
		
	}
	
}
