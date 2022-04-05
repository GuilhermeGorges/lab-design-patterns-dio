package com.guilherme.singleton;

/***
 * Singleton "Lazy Holder"
 *
 * @see <a href="http://stackoverflow.com/a/24018148">Reference</a>
 *
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
