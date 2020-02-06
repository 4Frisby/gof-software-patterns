package com.tariknural.softwarepatterns.behavioral.observer;

public class NewsChannel implements IObserver {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public String getNews() {
        return this.news;
    }

    public void setNews(String news) {
        this.news = news;
    }

}