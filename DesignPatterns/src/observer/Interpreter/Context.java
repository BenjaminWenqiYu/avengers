package observer.Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 完成通用的操作
 */
public class Context {
	private Map<Variable,Boolean> map = new HashMap<Variable,Boolean> ();

	public void assign(Variable var, Boolean value) {
		map.put(var,value);
	}

	public  Boolean lookup(Variable var){
		return map.get(var);
	}

}
