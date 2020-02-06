package com.tariknural.softwarepatterns.structural.adapter;

public class MovableAdapterImpl implements IMovableAdapter {
    IMovable americanCar;

    public MovableAdapterImpl(IMovable americanCar) {
        this.americanCar = americanCar;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(americanCar.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}