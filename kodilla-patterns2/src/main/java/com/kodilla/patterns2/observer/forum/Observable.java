package com.kodilla.patterns2.observer.forum;

public interface Observable {
    void registerObserver(Observer observer);

    void notifyObserers();

    void removeObserver(Observer observer);
}
