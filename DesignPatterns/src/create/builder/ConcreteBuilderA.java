package create.builder;

/**
 * 具体的构建者
 */
public class ConcreteBuilderA extends  Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("part A");
	}

	@Override
	public void buildPartB() {
		product.add("part B");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
