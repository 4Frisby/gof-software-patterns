package com.tariknural.softwarepatterns.behavioral.command;

public class SaveFileOperation implements ICommandInterface {
    IFile file = new File();

    @Override
    public String execute() {
        return file.saveTextFile();
    }

    public IFile getFile() {
        return this.file;
    }

    public void setFile(IFile file) {
        this.file = file;
    }

}