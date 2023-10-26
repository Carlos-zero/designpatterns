package com.example.designpatterns.proxyPattern.version_3;

// InvocationHandler 是 reflect 包的一部分

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {              // 所有调用处理器都实现 InvocationHandler 接口
    Person person;

    // 我们将 person 传入构造器，并保持它的引用
    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    // 每次 proxy 的方法被调用，就会导致 proxy 调用此方法
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (method.getName().startsWith("get")) {                       // 如果方法是一个 getter 被调用，我们就调用 person 内的方法
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {          // 否则，如果方法是 setHotOrNotRating()，我们就抛出异常
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {                // 因为我们是拥有者，所以任何其他set方法都可以使用，我们就在真正的主题上调用它。
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}


