package create.prototype;

public class Client {
	public static void main(String[] args) {
		Prototype prototype = new Prototype("1");
		Prototype clone = prototype.clone();
		System.out.println(clone.getId());
	}
}
