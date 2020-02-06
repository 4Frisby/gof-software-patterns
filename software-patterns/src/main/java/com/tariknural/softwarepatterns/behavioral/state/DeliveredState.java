package com.tariknural.softwarepatterns.behavioral.state;

/**
 * DeliveredState
 */
public class DeliveredState implements IState {

    @Override
    public void next(StateKeeper sk) {
        System.out.println("Order already delivered no further step !");
    }

    @Override
    public void prev(StateKeeper sk) {
        System.out.println("From delivered state to -> ordered state");
        sk.setState(new OrderedState());
    }

    @Override
    public String printStatus() {
        return "Package delivered, to the office.";
    }
}