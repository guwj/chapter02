package day0920;

public class Student extends Person {
	public void a(){
		System.out.println("자식");
	}
	public Student(){
		super();		// super는 자식 생성자에 선행해서 실행돼야 하기 때문에 반드시 맨 앞에 나와야 한다
		
		age =40;		// 부모의 default는 자식에서 접근 가능(단, 같은 패키지에서만)
		name = "김용준";	// 부모의 protected는 자식에서 접근 가능(다른 패키지에서도 가능)
		//height = 174; // 부모의 private은 자식에서 접근 불가능
		weight = 61;    // 부모의 public은 자식에서 접근 가능
		
		System.out.println("Student() called");
	}
	
	public Student(int age){
		super(age);
		System.out.println("Student(int age) called");
	}
}
