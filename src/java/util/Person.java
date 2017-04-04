package util;

public class Person {

//	Alt + F7

//	Ctrl + Alt + F7 | Ctrl + B
	private final long id;
	private final String name;
	
	public Person(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}