package com.tariknural.softwarepatterns.structural.proxy;

public class ProxyObject implements CommonInterface {
    ExistingObject eo;

    public ProxyObject() {
        this.eo = new ExistingObject();
    }

    @Override
    public int returnNumber() {
        if (this.eo == null)
            this.eo = new ExistingObject();

        return this.eo.returnNumber() + 5;
    }

}