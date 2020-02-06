package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * RedButton
 */
public class WindowsButton implements IButton {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}