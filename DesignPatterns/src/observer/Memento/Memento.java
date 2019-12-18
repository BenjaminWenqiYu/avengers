package observer.Memento;

public class Memento {

	private String name;
	private String phone;
	private double budget;

	public Memento(String name, String phone, double budget) {
		this.name = name;
		this.phone = phone;
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
}
