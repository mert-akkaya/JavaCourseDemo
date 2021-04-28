package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitsPrice=15000;
		product1.detail="16GB RAM";
		
		Product product2 = new Product(1,"Lenovo V15",16000,"32GB RAM");
		
		Product[] products ={product1,product2};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(product1.name);
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
	}

}
