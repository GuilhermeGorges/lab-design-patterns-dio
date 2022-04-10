package com.guilherme.strategy;

/***
 * Strategy: Default
 * @author Guilherme
 */
public class DefaultBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Normal moves...");
    }


}
