package com.tariknural.softwarepatterns.behavioral.strategy;

/**
 * IEncryptionStrategy
 */
public interface IEncryptionStrategy {

    String encrypt(String text);
    String decrypt(String text);
    
}