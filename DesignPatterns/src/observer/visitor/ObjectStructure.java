package observer.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> list = new ArrayList<Element>();

	//添加元素
	public  void attach(Element element) {
		list.add(element);
	}

	//删除元素
	public void detach(Element element) {
		list.remove(element);
	}

	//访问者访问所有的角色
	public void accept(Visitor visitor) {
		for (Element element : list) {
			element.accept(visitor);
		}
	}

}
