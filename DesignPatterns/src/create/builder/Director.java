package create.builder;

/**
 * 指挥者
 */
public class Director {

	/**
	 * 客户端不需要知道构建产品的步骤，只用调用build方法
	 * 即可完成产品的构建
	 * @param builder
	 */
	public void build(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
