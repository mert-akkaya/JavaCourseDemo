package oopIntro;

public class Product {
	
	private int id;
	private String name;
	private double unitsPrice;
	private String detail;
	private double discount;
	

	public Product() {
		
	}
	
	public Product(int id, String name, double unitsPrice, String detail,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitsPrice = unitsPrice;
		this.detail = detail;
		this.discount = discount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getUnitsPrice() {
		return unitsPrice;
	}



	public void setUnitsPrice(double unitsPrice) {
		this.unitsPrice = unitsPrice;
	}



	public String getDetail() {
		return detail;
	}



	public void setDetail(String detail) {
		this.detail = detail;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public double getUnitsPriceAfterDiscount() {
		return this.unitsPrice-(this.unitsPrice*this.discount/100);
	}

	

	


	
	
	
}
