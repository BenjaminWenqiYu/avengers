package construct.facade;

public class Client {

	public static void main(String[] args) {
		Student student = new Student("M",17);

		Facade facade = new Facade();
		boolean validate = facade.isValidate(student);

		System.out.println(validate);
	}
}
