package bit2016.goodsman.data;

public class Goods {
	public Goods(){	// 생성자는 new 후에만 사용될 수 있고 return type이 없다는 점에서 메소드와 차이
		System.out.println("생성자 호출");
		count++;
	}
	public static int count; // 클래스변수 or static변수 라고 한다
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//이제 private을 사용했기 때문에 데이터에 접근 불가 때문에 getter/setter를 이용하여 접근하는 것
	
	public String getName() {
		return name;
	}
	
	//return 값이 없고 매개변수(parameter)가 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	//return 값이 있고 매개변수(parameter)가 없는 메소드
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 메소드를 통해 데이터에 마이너스 값이 들어가지 못하도록 정보 보호
		if(price <0){
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	// return 값과 매개변수(parameter)가 없는 메소드
	public void showInfo(){
		System.out.println("name : " + name + ", " + "price : " + price + "," + "countStock" + countStock + "," + "countSold" + countSold);
	}
	
	// return 값과 매개변수(parameter)가 있는 메소드
	public int calcDiscountPrice(double rate){
		int discountPrice = (int)(price * rate);
		return discountPrice;
	}
	
	
}
