package com.guilherme.strategy;

/***
 * Strategy: Defensive
 * @author Guilherme
 */
public class DefensiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Defensive moves...");
    }


}
