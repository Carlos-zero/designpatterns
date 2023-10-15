public abstract class PizzaStore {
 
    // 让每个子工厂自己决定如何制造Pizza，这也许是工厂模式的特点，会定义一个工厂类的抽象用以实现多个具体的工厂
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
