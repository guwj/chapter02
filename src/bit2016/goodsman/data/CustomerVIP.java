package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setName(){
		
		// public은 자식 클래스에서 접근 가능
		name = "도우너"; 
		
		// protected는 자식 클래스에서 접근 가능
		phone = "010"; 
		
		// private은 자식 클래스에서 접근 불가능
		//email = "guwj";
	}
}
