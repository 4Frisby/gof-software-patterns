
package com.tariknural.softwarepatterns.structural.adapter;

public class AmericanCar implements IMovable {
    @Override
    public double getSpeed() {
        return 268;
    }

    @Override
    public double MPHRelatedMethod() {
        System.out.println("this method makes you create adapter, because this make this interface incompatible of yours");
        return 0;
    }

}