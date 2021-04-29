package courseAssignment;

public class StudentManager extends UserManager {

	public void registerCourse(Course course) {
		System.out.println(course.getCourseName() + " registered." );
	}
	public void postComment(String message,Student student) {
		System.out.println(student.getFirstName() + " posted this comment : "+ message);
		student.setMessage(message);
	}
}
