package com.tariknural.softwarepatterns.behavioral.state;

public class StateKeeper {
    IState state;

    public StateKeeper() {
        this.state = new OrderedState();
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public String printStatus() {
        return state.printStatus();
    }

    public IState getState() {
        return this.state;
    }

    public void setState(IState state) {
        this.state = state;
    }

}