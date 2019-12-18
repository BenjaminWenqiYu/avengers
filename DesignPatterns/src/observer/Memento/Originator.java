package observer.Memento;

public class Originator {

	private String name;
	private String phone;
	private double budget;

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

	//存储数据到备忘录
	public Memento saveMemento() {
		return new Memento(name,phone,budget);
	}

	//从备忘录中恢复
	public void restoreMemento(Memento memento) {
		this.name = memento.getName();
		this.phone =  memento.getPhone();
		this.budget =  memento.getBudget();
	}

	public  void show() {
		System.out.println("name: "+name);
		System.out.println("phone: "+phone);
		System.out.println("budget: "+budget);
	}


}

