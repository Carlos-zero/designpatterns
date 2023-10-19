package com.example.designpatterns.IteratorPattern.version_1.Iterator;

import com.example.designpatterns.IteratorPattern.version_1.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
