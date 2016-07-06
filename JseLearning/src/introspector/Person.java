package introspector;

import java.util.Date;

public class Person {
	private String name1 = "yyy";
	private int age1 = 18;
	private Date birth1;

	public String getName() {
		return name1;
	}

	public void setName(String name) {
		this.name1 = name;
	}

	public int getAge() {
		return age1;
	}

	public void setAge(int age) {
		this.age1 = age;
	}

	public Date getBirth() {
		return birth1;
	}

	public void setBirth(Date birth) {
		this.birth1 = birth;
	}

	@Override
	public String toString() {
		return "Person [name1=" + name1 + ", age1=" + age1 + ", birth1="
				+ birth1 + "]";
	}

}
