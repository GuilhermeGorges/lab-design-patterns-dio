package com.guilherme.singleton;

/***
 * Singleton "Eager"
 * @author Guilherme
 */

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        super();
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
