package com.tariknural.softwarepatterns.behavioral.command;

public class File implements IFile {
    private String text;

    public File(String text) {
        this.text = text;
    }

    public File() {
	}

	@Override
    public String readTextFromFile() {
        return "command class reading from text file";
    }

    @Override
    public String saveTextFile() {
        return "command class saving to text file";
    }

    @Override
    public void moreMethodsYouDontNeed() {
        System.out.println("your interface does not need these methods.");
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

}