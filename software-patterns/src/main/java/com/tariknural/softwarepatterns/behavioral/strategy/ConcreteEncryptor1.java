package com.tariknural.softwarepatterns.behavioral.strategy;

/**
 * ConcreteEncryptor1
 */
public class ConcreteEncryptor1 implements IEncryptionStrategy {

    @Override
    public String encrypt(String text) {
        return "class 1 encrypt";
    }

    @Override
    public String decrypt(String text) {
        return "class 1 decrypt";
    }

}