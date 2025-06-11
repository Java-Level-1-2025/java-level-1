package net.groundgurus.day4.model;

public class Employee {
    private long id;
    private String name;
    private String department;

    // getters/setters <- term in Java
    // accessor/mutator <- general term

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
