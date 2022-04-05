package com.guilherme.singleton;

/***
 * Singleton "Lazy Holder"
 * @author guilherme
 */

public class LazyHolderSingleton {

    private static class InstanceHolder {
    public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton(){
        super();
    }

    public static LazyHolderSingleton getInstance(){
        return InstanceHolder.instance;
    }
}
