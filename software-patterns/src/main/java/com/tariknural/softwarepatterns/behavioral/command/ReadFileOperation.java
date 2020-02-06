package com.tariknural.softwarepatterns.behavioral.command;

public class ReadFileOperation implements ICommandInterface {

    private IFile file = new File();

    // its possible add additional conditions,
    // keeping track of previous executions,
    // deciding according to state of other object
    // so this is the interface you provide to client instead commands class's itself.
    @Override
    public String execute() {
        return file.readTextFromFile();
    }

    public IFile getFile() {
        return this.file;
    }

    public void setFile(IFile file) {
        this.file = file;
    }


}