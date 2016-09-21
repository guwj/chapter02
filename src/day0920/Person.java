package day0920;

public class Person {
	public void a(){
		System.out.println("부모");
	}
	
	public Person() {
		System.out.println("Person() called");
	}
	
	public Person(int age) {
		System.out.println("Person(int age) called");
	}

	int age; // default 접근자
	protected String name; // protected 접근자
	private int height; // private 접근자
	public int weight;
}
