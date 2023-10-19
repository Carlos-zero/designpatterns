package com.example.designpatterns.IteratorPattern.version_1.other;

import java.util.ArrayList;
import com.example.designpatterns.IteratorPattern.version_1.MenuItem;
import com.example.designpatterns.IteratorPattern.version_1.Iterator.Iterator;

public class ArrayListIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;
 
	public ArrayListIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
