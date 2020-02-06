package com.tariknural.softwarepatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBridge{

    protected int timeToWork;
    protected List<WorkShop> workShops = new ArrayList<>();


    public AbstractBridge(int timeToWork){
        this.timeToWork = timeToWork;
    }

    abstract void manifacture();
}