package bit2016.paint;

public class Pentagon extends Shape implements Drawable {

	@Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public void draw() {
		System.out.println("오각형을 그렸습니다");
	}

}
