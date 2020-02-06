package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * CheckBoxFactory
 */
public class LinuxGUIFactory implements AbstractFactory {

    @Override
    public IButton getButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckBox getCheckBox() {
        return new LinuxCheckBox();
    }

}