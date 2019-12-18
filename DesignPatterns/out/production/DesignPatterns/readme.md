https://www.w3cschool.cn/java/java-abstract-factory-pattern.html
设计模式:

创建型设计模式：
1.1简单工厂模式:Factory 根据字符串选择创建不同的形状
shape----CIRCLE             <---Factory <---client     
     ----RECTANGLE          <---
     ----SQUARE             <---
饭店里点菜

1.2抽象工程模式:client根据字符串选择Factory，然后Factory根据字符串选择创建不同的对象
shape----CIRCLE             <---Factory <---client     
     ----RECTANGLE          <---
     ----SQUARE             <---
     
shape----Paper              <---Factory <---client     
     ----Web                <---
     ----Screen             <---   
选择饭店，然后饭店点菜

2.单例模式：私有的构造方法，调用getInstance()方法获取对象，懒汉式(已创建)和饿汉式(使用时创建)


3.原型模式: 实现Cloneable接口，调用父类的super.clone()方法
鸣人的影分身

4.生成器模式(建造者模式):指挥者包含着构建者的引用，指挥者中完成构建的步骤。
 时间=生活+工作   
    
 
行为型设计模式：
1.观察者模式：主题中包含所有观察者，当主题改变时，调用观察者的update()
出去聚餐，微信群

2.策略模式：拥有策略类的引用，调用实现的策略方法(选择排序，冒泡排序)
如何下班回家

3.模板模式：父类包含执行步骤的聚合方法，而每个具体步骤的实现可以在子类完成
每天的计划

4.迭代器模式：使用list或者array,使用计数器,实现hasNext(),next()方法
使用list定义迭代器

5.命令模式：invoker中含有command的引用，command含有recevier引用，调用invoker
的execute()方法，实际上调用recevier的execute()方法
需求方，项目经理，程序员

6.备忘录模式:看管者角色对象用来保存备忘录对象

7.中介者模式:
