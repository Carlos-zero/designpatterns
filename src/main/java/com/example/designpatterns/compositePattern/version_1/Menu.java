package com.example.designpatterns.compositePattern.version_1;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * 菜单类，注意，对菜单类没有意义的方法我们并没有覆盖。
 */
public class Menu extends MenuComponent {
    // 菜单可以有任意数目的子节点，这些子节点都必须是 MenuComponent 类型
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
    
    // 我们在这里将菜单项和其他菜单加入到菜单中，因为菜单和菜单项都是MenuComponent。
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}