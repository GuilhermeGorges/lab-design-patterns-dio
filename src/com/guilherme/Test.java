package com.guilherme;

import com.guilherme.singleton.EagerSingleton;
import com.guilherme.singleton.LazyHolderSingleton;
import com.guilherme.singleton.LazySingleton;
import com.guilherme.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton

        // Lazy Singleton Pattern Test
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);

        // Eager Singleton Pattern Test
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
        eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);

        // Lazy Holder Singleton Pattern Test
        LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderSingleton);
        lazyHolderSingleton = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderSingleton);

        // Strategy

        Behavior defaultBehavior = new DefaultBehavior();
        Behavior aggressiveBehavior = new AggressiveBehavior();
        Behavior defensiveBehavior = new DefensiveBehavior();

        Boot boot = new Boot();

        boot.setBehavior(defaultBehavior);
        boot.move();

        boot.setBehavior(aggressiveBehavior);
        boot.move();

        boot.setBehavior(defensiveBehavior);
        boot.move();

    }
}
