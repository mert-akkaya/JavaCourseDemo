package oopIntro;

public class Category {

	private int �d;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		super();
		�d = id;
		this.name = name;
	}

	public int getId() {
		return �d;
	}

	public void setId(int id) {
		�d = id;
	}

	public String getName() {
		return name + "!";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
