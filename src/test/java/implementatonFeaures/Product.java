package implementatonFeaures;

import java.util.ArrayList;
import java.util.List;

public class Product {
	 private String Productname;
	 private int price;
	
	
	public Product(String productname, int price) {
		super();
		Productname = productname;
		this.price = price;
	}


	public String getProductname() {
		return Productname;
	}


	public void setProductname(String productname) {
		Productname = productname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public List<String> getprodcutlist(){
		
		List<String> productlist=new ArrayList<>();
		productlist.add("Apple Macbook pro");
		productlist.add("Apple Macbook pro sample");
		productlist.add("Apple Macbook pro text");
		return productlist;
		
	}
	

}
