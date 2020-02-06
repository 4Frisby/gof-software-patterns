package com.tariknural.softwarepatterns.structural.bridge;

public class Bike extends AbstractBridge{

    public Bike(int timeToWork) {
        super(timeToWork);
    }

    @Override
    public void manifacture() {
        System.out.println("Manufactoring Bike...");
        workShops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

}