package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		name = "Veggie Pizza";                  // 全素披萨
		dough = "Crust";                        // 面包皮
		sauce = "Marinara sauce";               // Marinara酱
		toppings.add("Shredded mozzarella");    // 马苏里拉奶酪丝
		toppings.add("Grated parmesan");        // 磨碎的奶酪
		toppings.add("Diced onion");            // 洋葱丁
		toppings.add("Sliced mushrooms");       // 蘑菇片
		toppings.add("Sliced red pepper");      // 红辣椒片
		toppings.add("Sliced black olives");    // 黑橄榄切片
	}
}
