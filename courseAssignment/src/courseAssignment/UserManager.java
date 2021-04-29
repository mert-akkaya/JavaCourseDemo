package courseAssignment;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " added.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " deleted.");
	}
	public void login(User user) {
		System.out.println(user.getFirstName() + " logined");
	}
	public void register(User user) {
		System.out.println(user.getFirstName() + " registered");
	}
}
