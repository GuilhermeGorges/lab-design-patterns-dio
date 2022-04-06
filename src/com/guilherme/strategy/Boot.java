package com.guilherme.strategy;

/***
 * Strategy: Test
 * @author guilherme
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
