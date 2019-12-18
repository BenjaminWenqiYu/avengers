package construct.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {

	private List<Component> list = new ArrayList<Component>();

	public void add(Component component) {
		list.add(component);
	}

	public void remove(Component component) {
		list.remove(component);
	}

	public List<Component> getAll() {
		return list;
	}

	public void doSomeThing() {
		for (Component component : list) {
			component.doSomeThing();
		}
	}
}
