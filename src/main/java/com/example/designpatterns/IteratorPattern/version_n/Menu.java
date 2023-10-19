package com.example.designpatterns.IteratorPattern.version_n;

import java.util.Iterator;

/**
 * 菜单
 */
public interface Menu {
	public Iterator<?> createIterator();
}