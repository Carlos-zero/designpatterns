package com.example.designpatterns.IteratorPattern.version_1;

/**
 * 需要合并成这样的菜单
 */
public class MenuItem {
	String name;                // 菜名
	String description;         // 描述
	boolean vegetarian;         // 是否素食
	double price;               // 价格
 
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
}
