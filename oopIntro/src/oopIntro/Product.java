package oopIntro;

public class Product {
	
	public Product(){
		
	}
	public Product(int id,String name,double unitsPrice,String detail) {
		this.id = id;
		this.name=name;
		this.unitsPrice=unitsPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitsPrice;
	String detail;
	
}
