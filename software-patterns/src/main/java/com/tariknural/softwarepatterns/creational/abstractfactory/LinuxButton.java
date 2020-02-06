package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * BlueButton
 */
public class LinuxButton implements IButton {

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}