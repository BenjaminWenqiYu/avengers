package create.builder;

/**
 * 具体的构建者
 */
public class ConcreteBuilderB extends  Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("part X");
	}

	@Override
	public void buildPartB() {
		product.add("part Y");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
