package com.guilherme.singleton;

public class Test {
    public static void main(String[] args) {

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




    }
}
