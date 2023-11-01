package com.example.designpatterns.decoratorPattern.version_1.decorator;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;
import com.example.designpatterns.decoratorPattern.version_1.CondimentDecorator;

/**
 * mocha是一个装饰者，所以让它扩展自 CondimentDecorator。
 */
public class Mocha extends CondimentDecorator {
    // 要让 Mocha 能够引用一个 Beverage，做法如下：
    // ①：用一个实例变量记录饮料，也就是被装饰者
    // ②：想办法让被装饰者（饮料）被记录到实例变量中。这里的做法是：把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中。
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    // 我们希望叙述不只是描述（例如，“DarkRoast”），而是完整地连调料都描述出来（例如 “DarkRoast，Mocha”）。所以首先利用委托的做法，得到一个叙述。然后再其后面加上附加的叙述（例如 “Mocha”）。
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    // 要计算带 Mocha 饮料的价钱。首先把调用委托给被装饰对象，以计算价钱，然后再加上 Mocha 的价钱， 得到最后结果。
    public double cost() {
        return .20 + beverage.cost();
    }
}
