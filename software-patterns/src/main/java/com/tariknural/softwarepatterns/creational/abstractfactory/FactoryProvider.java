package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * FactoryProvider
 */
public class FactoryProvider {

    public AbstractFactory getFactory(String type) {
        if ("windows".equals(type)) {
            return new WindowsGUIFactory();
        } else if ("linux".equals(type)) {
            return new LinuxGUIFactory();
        }
        return null;
    }
}