package com.tariknural.softwarepatterns.behavioral.state;

/**
 * IState
 */
public interface IState {
    void next(StateKeeper sk);
    void prev(StateKeeper sk);
    String printStatus();
}