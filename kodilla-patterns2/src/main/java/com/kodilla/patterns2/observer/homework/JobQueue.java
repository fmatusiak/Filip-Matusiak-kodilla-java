package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;

public class JobQueue implements Observable {
    private ArrayList<ObserverMentor> observerMentors = new ArrayList<>();
    private ArrayList<String> tasks = new ArrayList<>();
    private String nameStudent;

    public JobQueue(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
        notifyMentor();
    }

    public void removeTask(String taskName) {
        tasks.remove(taskName);
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    @Override
    public void registerMentor(ObserverMentor observerMentor) {
        observerMentors.add(observerMentor);
    }

    @Override
    public void notifyMentor() {
        for (ObserverMentor observerMentor : observerMentors) {
            observerMentor.update(this);
        }
    }
}
