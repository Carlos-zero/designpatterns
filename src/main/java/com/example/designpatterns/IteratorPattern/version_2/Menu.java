package com.example.designpatterns.IteratorPattern.version_2;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
