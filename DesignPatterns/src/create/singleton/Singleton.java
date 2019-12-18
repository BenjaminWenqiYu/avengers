package create.singleton;

public class Singleton {



	private Singleton() {

	}


	/*
	懒汉式:线程安全的，当类进行加载的时候创建对象
	private static Singleton singleton = new Singleton();
	public static Singleton getSingleton() {
		return singleton;
	}
	*/
	/**
	 * 饿汉式:线程不安全，多线程情况下，会出现创建多个对象
	 */
	private static Singleton singleton;
	public  static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
