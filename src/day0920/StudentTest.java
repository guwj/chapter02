package day0920;

public class StudentTest {

	public static void main(String[] args) {
		//특별한 지시가 없으면 자식을 호출시 부모의 기본 생성자가 실행되고 자식의 생성자가 실행된다
		
		Person p = new Student();
		p.a();
		
		//Person p2 = new Student(10);
		
		
		// 자식을 부모형으로 upcasting
		//Student s = new Student();
		//Person p3 = s;
		// = Person p3 = new Student();
		
		// 부모형을 자식형으로 downcasting -> 이 경우에는 반드시 명시적 형변환을 해야 한다
		//Student s1 = (Student)p3;
		
		// upcasting -> 암시적 형변환
		//Person p4 = s1;
	}

}
