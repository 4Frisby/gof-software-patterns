package com.tariknural.softwarepatterns.structural.bridge;

public class Car extends AbstractBridge{

    public Car(int timeToWork) {
        super(timeToWork);
    }

    @Override
    public void manifacture() {
        System.out.println("Manufactoring Car...");
        workShops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

}