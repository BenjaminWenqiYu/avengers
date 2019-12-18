package construct.facade;

public class Student {

	private String sex;
	private int age;

	public Student(String sex, int age) {
		this.sex = sex;
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
