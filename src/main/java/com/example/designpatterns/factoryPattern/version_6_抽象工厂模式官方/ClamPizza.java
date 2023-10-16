
/**
 * 蛤蜊披萨
 */
public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
        // 如果是纽约工厂，就会使用新鲜蛤蜊，如果是芝加哥工厂，就会使用冷冻蛤蜊
		clam = ingredientFactory.createClam();
	}
}
