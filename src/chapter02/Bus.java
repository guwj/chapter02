package chapter02;

public class Bus extends Car {
	public void test(){
		//speed = 0; -> 상속 받았다 해도 부모의 private으로는 접근 불가
		
		accelator = 10; // 부모의 protected는 접근 가능
	}
}
