package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * ButtonFactory
 */
public class WindowsGUIFactory implements AbstractFactory {

    @Override
    public IButton getButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckBox getCheckBox() {
        return new WindowsCheckBox();
    }

}