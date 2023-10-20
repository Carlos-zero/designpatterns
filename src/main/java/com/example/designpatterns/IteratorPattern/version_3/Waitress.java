package com.example.designpatterns.IteratorPattern.version_3;

import java.util.*;

/**
 * 最终完全版本，这里优化了一下，使用ArrayList来存储menus，然后在打印Menu的时候就也可以使用Iterator了
 */
public class Waitress {
	ArrayList<Menu> menus;
     
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
   
	public void printMenu() {
		Iterator<?> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}  