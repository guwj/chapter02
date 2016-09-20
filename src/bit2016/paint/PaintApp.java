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
		
		Shape rectangle = new Rectangle();
		//rectangle.draw();
		draw(rectangle);
		
		Shape circle= new Circle();
		//circle.draw();
		draw(circle);
		
		Shape Triangle = new Triangle();
		//Triangle.draw();
		draw(Triangle);
		
		Shape CircleTest = new Circle();
		draw( CircleTest );
		
		draw( new Pentagon() );
	}
	
	public static void draw( Shape shape ){
		shape.draw();
		
	}
}
