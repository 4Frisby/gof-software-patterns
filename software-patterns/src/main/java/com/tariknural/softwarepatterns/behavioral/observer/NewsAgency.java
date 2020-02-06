package com.tariknural.softwarepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements IObservable{
    private String news;
    private List<IObserver> channels = new ArrayList<>();

    public void addObserver(IObserver channel) {
        this.channels.add(channel);
    }

    public void removeObserver(IObserver channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public void notifyObservers() {
        for (IObserver channel : this.channels) {
            channel.update(this.news);
        }
    }

}