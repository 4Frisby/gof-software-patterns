package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * BlueCheckBox
 */
public class WindowsCheckBox implements ICheckBox {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}