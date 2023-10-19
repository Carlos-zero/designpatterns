package com.example.designpatterns.IteratorPattern.version_2;

import java.util.Iterator;
import java.util.Calendar;

/**
 * 至今不知道这个是做啥的，好像是分日期，奇数天出奇数序号的菜，偶数天出偶数序号的菜
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	/* 
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 * 
	public void remove() {
		throw new UnsupportedOperationException(
			"Alternating Diner Menu Iterator does not support remove()");
	}
	*/
}