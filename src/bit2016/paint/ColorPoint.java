package bit2016.paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color){
		setX(x);
		setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show(){
		System.out.println("[x = " + getX() + ",y = " + getY() + ", color = " + color + "]을 그렸습니다");
	}
}
