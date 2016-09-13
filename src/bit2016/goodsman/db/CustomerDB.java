package bit2016.goodsman.db;

import bit2016.goodsman.data.Customer;

public class CustomerDB {
	void insert(){
		Customer c = new Customer();
		c.name = "김용준"; // public은 다른 패키지에서도 접근 가능
		// c.phone = "010"; protected는 다른 패키지에서는 접근안됨
	}
}
