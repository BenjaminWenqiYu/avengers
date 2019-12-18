package create.singleton;

public class Client {

	public static void main(String[] args) {
		Singleton singletonA = Singleton.getSingleton();
		Singleton singletonB = Singleton.getSingleton();
		System.out.println(singletonA.equals(singletonB));
	}
}
