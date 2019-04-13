package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverMentor {
    private String name;
    private int countTask;

    public Mentor(String name){
        this.name = name;
    }

    @Override
    public void update(JobQueue jobQueue) {
        countTask++;
        System.out.println("Mentor name: " + name + " Count tasks: " + countTask);
    }

    public String getName() {
        return name;
    }

    public int getCountTask() {
        return countTask;
    }
}
