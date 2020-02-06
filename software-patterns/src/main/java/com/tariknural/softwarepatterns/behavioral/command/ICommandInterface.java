package com.tariknural.softwarepatterns.behavioral.command;

public interface ICommandInterface{
    public String execute();
    public void setFile(IFile file);
}