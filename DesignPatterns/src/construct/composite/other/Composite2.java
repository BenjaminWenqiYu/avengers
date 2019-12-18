package construct.composite.other;

import construct.composite.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite2 implements Component2 {

	private List<Component2> list = new ArrayList<Component2>();

	public void add(Component2 component) {
		list.add(component);
	}

	public void remove(Component2 component) {
		list.remove(component);
	}

	public List<Component2> getAll() {
		return list;
	}

	public void doSomeThing() {
		for (Component2 component : list) {
			component.doSomeThing();
		}
	}
}
