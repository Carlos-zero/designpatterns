package com.example.designpatterns.IteratorPattern.version_3;

import java.util.Iterator;

/**
 * 菜单
 */
public interface Menu {
	public Iterator<?> createIterator();
}