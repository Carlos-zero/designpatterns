package com.example.designpatterns.proxyPattern.version_1;

import com.example.designpatterns.proxyPattern.version_1.state.State;

import java.rmi.*;

/**
 * 这是一个远程接口，定义了远程方法，用于获取糖果机的位置、数量和当前状态。
 * focus:
 * 想要成为远程接口，继承 Remote 即可。
 * focus:
 * 这其实就相当于是 GumballMachine 的代理，通过这个来获取 GumballMachine 的状态等信息。
 */
public interface GumballMachineRemote extends Remote {
    /**
     * 所有返回值的类型都必须是原语类型或者可序列化类型；
     * 这些就是远程接口
     */
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}

