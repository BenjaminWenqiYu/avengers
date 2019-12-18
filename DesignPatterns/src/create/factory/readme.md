工厂模式：
1.定义：
使一个类(MobileFactory)的实例化延迟其子类(NokiaFactory)

2.适用性：
当一个类不知道它所必须创建的对象的类的时候

3.模式的组成:
产品角色(Product)：定义产品的接口
具体产品角色(ConcreteProduct):实现product接口的类
工厂角色(Factory):声明工厂方法，返回一个产品
具体工程角色(ConcreteFactory):具体的工厂，返回一个具体的产品实例

4.UML图，时序图