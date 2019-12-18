package create.builder;

/**
 * 抽象建造者
 */
public abstract  class Builder {

	//构建产品的第一步
	public abstract void buildPartA();

	//构建产品的第二步
	public abstract void buildPartB();

	//取回产品
	public abstract Product getResult();
}
