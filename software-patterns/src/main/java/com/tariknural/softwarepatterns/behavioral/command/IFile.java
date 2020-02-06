package com.tariknural.softwarepatterns.behavioral.command;

public interface IFile{
    String readTextFromFile();
    String saveTextFile();
    void moreMethodsYouDontNeed();
    String getText();
    void setText(String text);
}