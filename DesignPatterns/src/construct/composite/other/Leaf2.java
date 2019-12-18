package construct.composite.other;


import java.util.List;

public class Leaf2 implements Component2 {

	@Override
	public void doSomeThing() {
		System.out.println("执行方法");
	}

	@Override
	public void add(Component2 component) {

	}

	@Override
	public void remove(Component2 component) {

	}

	@Override
	public List<Component2> getAll() {
		return null;
	}

}
