package oopIntro;

public class Category {

	private int ýd;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		super();
		ýd = id;
		this.name = name;
	}

	public int getId() {
		return ýd;
	}

	public void setId(int id) {
		ýd = id;
	}

	public String getName() {
		return name + "!";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
