package com.tariknural.softwarepatterns.structural.proxy;

public class ExistingObject implements CommonInterface {

    @Override
    public int returnNumber() {
        return 5;
    }

}