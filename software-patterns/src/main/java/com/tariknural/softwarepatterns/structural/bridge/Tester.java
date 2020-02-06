package com.tariknural.softwarepatterns.structural.bridge;

public class Tester extends WorkShop {

    @Override
    void work(AbstractBridge vehicle) {
        System.out.println("Tester took" + 4 + vehicle.timeToWork);
    }

}