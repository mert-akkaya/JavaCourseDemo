package courseAssignment;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Mert");
		student1.setLastName("Akkaya");
		student1.setEmail("mert@mert.com");
		student1.setPassword("12345");
		
		System.out.println("Student : " +student1.getFirstName() + " "+ student1.getLastName());
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engin@engin.com");
		instructor1.setPassword("123456");
		instructor1.setCreatedCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		
		System.out.println("Instructor : " +instructor1.getFirstName() + " "+ instructor1.getLastName());
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		userManager.login(student1);
		userManager.login(instructor1);
		
		Course course = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",instructor1.getFirstName());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(course);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(course);
		studentManager.postComment("Perfect Course", student1);
		
		
		
		
	}

}
