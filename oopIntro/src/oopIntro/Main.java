package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		
		product1.setId(2);
		product1.setName("Lenovo V15");
		product1.setUnitsPrice(16000);
		product1.setDiscount(10);
		product1.setDetail("16 GB RAM");
		
		
		System.out.println(product1.getUnitsPriceAfterDiscount());
		 
		Product product2 = new Product(3,"Lenovo",8000,"8 GB RAM",5);
		
		System.out.println(product2.getUnitsPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Ýçecek");
		Category category2 = new Category();
		category2.setId(3);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
