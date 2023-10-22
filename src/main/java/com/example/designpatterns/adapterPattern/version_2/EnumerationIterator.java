package com.example.designpatterns.adapterPattern.version_2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 因为我们要将枚举适配成迭代器，所以适配器需要实现迭代器接口
 */
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    // 我们利用组合的方式，将枚举结合进入适配器中，所以用一个实例变量记录枚举
    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    // 迭代器的 hasNext() 方法其实是委托给枚举的 hasMoreElements() 方法
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    // 而迭代器的 next() 方法其实是委托给枚举的 nextElement() 方法
    public Object next() {
        return enumeration.nextElement();
    }

    // 很不幸，我们不能支持迭代器的 remove() 方法，所以必须放弃；在这里，我们的做法是抛出一个异常。
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
