package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable {
    private final List<Observer> observers;
    private final List<String> messages;
    private final String name;

    public ForumTopic(String name) {
        this.observers = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post){
        messages.add(post);
        notifyObserers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
