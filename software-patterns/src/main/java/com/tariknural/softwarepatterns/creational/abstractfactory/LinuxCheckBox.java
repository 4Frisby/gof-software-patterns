package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * RedCheckBox
 */
public class LinuxCheckBox implements ICheckBox {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
    
}