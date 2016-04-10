package day15;

public class Person  {
	Person(){
		
	}
	Person(Person p ){
		this.name = p.getName();
		this.age = p.getAge();

	}
	Person(String name,String age){
		this.age = age;
		this.name = name;
	}
	Person(String name){
		this.name = name;
	}

	private String name;
	private String age;
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Person o) {
//		
//		return Integer.parseInt(this.age)-Integer.parseInt(o.getAge());
//	}
	
	
	
}
