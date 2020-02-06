package com.tariknural.softwarepatterns.structural.bridge;

public class Assembler extends WorkShop {

    @Override
    void work(AbstractBridge vehicle) {
        System.out.println("assembler took" +  5 + vehicle.timeToWork); 
    }

}