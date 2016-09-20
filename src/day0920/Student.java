package day0920;

public class Student extends Person {
	public Student(){
		age =40;		// 부모의 default는 자식에서 접근 가능(단, 같은 패키지에서만)
		name = "김용준";	// 부모의 protected는 자식에서 접근 가능(다른 패키지에서도 가능)
		//height = 174; // 부모의 private은 자식에서 접근 불가능
		weight = 61;    // 부모의 public은 자식에서 접근 가능
	}
}
