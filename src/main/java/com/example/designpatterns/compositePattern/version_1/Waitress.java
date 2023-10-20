package com.example.designpatterns.compositePattern.version_1;

public class Waitress {
	MenuComponent allMenus;
 
    // 只需要最顶层的菜单，最顶层的菜单包含了所有菜单
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
