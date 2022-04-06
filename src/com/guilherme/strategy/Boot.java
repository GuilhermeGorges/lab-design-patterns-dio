package com.guilherme.strategy;

/***
 * Strategy: Test
 * @author Guilherme
 */
public class Boot {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move(){
        behavior.move();
    }
}
