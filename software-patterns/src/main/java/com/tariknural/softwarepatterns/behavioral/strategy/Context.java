package com.tariknural.softwarepatterns.behavioral.strategy;

/**
 * Context
 */
public class Context {
    IEncryptionStrategy ie;

    public Context() {
        ie = new ConcreteEncryptor1();
    }

    public IEncryptionStrategy getIe() {
        return this.ie;
    }

    public void setIe(IEncryptionStrategy ie) {
        this.ie = ie;
    }

    public String executeEncrypt(String text) {
        return ie.encrypt(text);
    }

    public String executeDecrypt(String text) {
        return ie.decrypt(text);
    }

}