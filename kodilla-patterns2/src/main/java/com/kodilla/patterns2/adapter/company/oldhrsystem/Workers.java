package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"12178954226", "John", "Smith"},
            {"65123654123", "Edward", "Acki"},
            {"45678912356", "Ivone", "Novak"},
            {"57891235704", "Michael", "Jackson"},
            {"14785236999", "Mariusz", "Kolanko"},
    };

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + " , " + workers[n][1] + " , " + workers[n][2] + " , " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
