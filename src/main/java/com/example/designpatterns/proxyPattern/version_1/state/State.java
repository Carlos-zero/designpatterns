package com.example.designpatterns.proxyPattern.version_1.state;

import java.io.Serializable;

/**
 * 这是糖果机状态接口，为糖果机的每一种状态都定义了一系列的方法，如投币、退币、转动遥杆、发放糖果等。
 * focus:
 * 继承 Serializable 后，当前类即可在网络上传输了
 */
public interface State extends Serializable {
    // 这个方法表示在糖果机中插入25美分的硬币的行为
    public void insertQuarter();

    // 这个方法表示在糖果机中弹出已经插入的25美分的行为
    public void ejectQuarter();

    // 这个方法表示转动糖果机的摇杆的行为
    public void turnCrank();

    // 这个方法表示糖果机出糖果的行为
    public void dispense();
}
