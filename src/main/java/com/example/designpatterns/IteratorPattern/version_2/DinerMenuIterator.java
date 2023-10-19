package com.example.designpatterns.IteratorPattern.version_2;

import java.util.Iterator;

/**
 * 因为数组没有Iterator相关的库函数，所以需要自己手动实现
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}
