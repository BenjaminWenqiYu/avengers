package construct.composite.other;

import java.util.List;

public interface Component2 {

	public void doSomeThing();

	public void add(Component2 component);

	public void remove(Component2 component);

	public List<Component2> getAll();
}
