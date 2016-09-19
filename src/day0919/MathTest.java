package day0919;

public class MathTest {

	public static void main(String args[]) {

		// 메소드에 static이 붙어있기 때문에 객체 선언 안하고도 사용할 수 있는 것이다 -> 객체의 필드를 이용해야할 필요가 없는 메소드는 static을 붙여서 그냥 쓰면 된다
		int i = Math.abs(-10);
		int j = Math.max(10, 20);
	}

	static int max(int i, int j) {
		if (i > j) {
			return i;
		}
		return j;

	}

}
