package com.example.designpatterns.compositePattern.version_1;

/**
 * 
 */
public abstract class MenuComponent {
   
    // 组合类方法，新增、删除、获取菜单组件
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
    // 操作类方法，被菜单项使用
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
  
    // 操作类方法，同时被菜单项和菜单使用
	public void print() {
		throw new UnsupportedOperationException();
	}
}
