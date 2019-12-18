package construct.facade;

public class Facade {

	public  boolean isValidate(Student student) {
		System1 system1 = new System1();
		System2 system2 = new System2();

		boolean sys1 = system1.isvalidate(student);
		boolean sys2 = system2.isvalidate(student);

		return sys1 && sys2;
	}
}
