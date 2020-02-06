package com.tariknural.softwarepatterns.behavioral.strategy;

/**
 * ConcreteEncryptor2
 */
public class ConcreteEncryptor2 implements IEncryptionStrategy {

    @Override
    public String encrypt(String text) {
        return "class 2 encrypt";
    }

    @Override
    public String decrypt(String text) {
        return "class 2 decrypt";
    }

}