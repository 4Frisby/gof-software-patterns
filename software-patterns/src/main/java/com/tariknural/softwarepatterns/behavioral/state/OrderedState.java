package com.tariknural.softwarepatterns.behavioral.state;

/**
 * OrderedState
 */
public class OrderedState implements IState {
    @Override
    public void next(StateKeeper pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(StateKeeper pkg) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public String printStatus() {
        return "Package ordered, not delivered to the office yet.";
    }

}