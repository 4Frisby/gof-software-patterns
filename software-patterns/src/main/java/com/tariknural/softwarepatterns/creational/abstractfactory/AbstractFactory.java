package com.tariknural.softwarepatterns.creational.abstractfactory;

/**
 * AbstractFactory
 */
public interface AbstractFactory {
    IButton getButton();
    ICheckBox getCheckBox();
}