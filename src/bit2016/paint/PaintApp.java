package bit2016.paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point = new Point();

		point.setX(100);
		point.setY(1000);

		point.show();

		Point point2 = new Point(10, 300);
		point2.show();

		point2.show(false);

		Point point3 = new ColorPoint(50, 60, "red");
		point3.show();
		point3.show(false);
		point3.show(true);

		// rectangle.draw();
		draw(new Rectangle());

		Drawable circle = new Circle();
		// circle.draw();
		draw(circle);

		Drawable Triangle = new Triangle();
		// Triangle.draw();
		draw(Triangle);

		Drawable CircleTest = new Circle();
		draw(CircleTest);

		draw(new Pentagon());

		draw(new ColorPoint(200, 100, "Black"));

		resize(new Circle(10));

		// instanceof test
		Circle c10 = new Circle();
		System.out.println(c10 instanceof Circle);
		// System.out.println(c10 instanceof Rectangle); -> instanceof는 상속관계에 있는
		// 클래스만확인할 수 있으므로 오류
		System.out.println(c10 instanceof Shape);

		// instanceof는 모든 인터페이스에 구현관계를 확인할 수 있다 -> 이 것으로 해당 인터페이스를 구현했는지 파악 가능
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);

		Rectangle rect = new Rectangle();
		System.out.println(rect instanceof Rectangle);
		System.out.println(rect instanceof Shape);
		System.out.println(rect instanceof Drawable);
		System.out.println(rect instanceof Resizable);

		resize2(new Rectangle());
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

	public static void resize2(Drawable drawable) {
		// Resizable을 구현하지 않은 drawable은 차단시켜줘서 오류 방지
		if (drawable instanceof Resizable == false) {
			return;
		}
		Resizable re = (Resizable) drawable;
		re.resize(0.8);
	}

	public static void resize(Resizable resizable) {
		Shape shape = (Shape) resizable;
		double area = shape.calculateArea();
		System.out.println(area);
		resizable.resize(0.5);
	}

	// public static void draw( Shape shape ){
	// shape.draw();

}
