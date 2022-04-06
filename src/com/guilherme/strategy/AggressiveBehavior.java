package com.guilherme.strategy;

/***
 * Strategy: Aggressive
 * @author guilherme
 */
public class AggressiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Aggressive moves...");
    }


}
