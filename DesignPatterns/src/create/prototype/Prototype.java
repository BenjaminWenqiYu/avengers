package create.prototype;

public  class Prototype implements Cloneable  {

	private String id;

	public Prototype(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public  Prototype clone() {
		Prototype clone = null;
		try {
			clone = (Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
