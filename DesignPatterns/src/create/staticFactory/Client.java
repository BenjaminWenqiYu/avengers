package create.staticFactory;


public class Client {
	public static void main(String[] args) {
		SchoolUser user = SimpleFactory.getSchoolUser("student", "123456");
		user.show();
	}
}
